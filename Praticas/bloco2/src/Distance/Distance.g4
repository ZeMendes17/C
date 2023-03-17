grammar Distance;

main: stat* EOF;

stat returns [Double res]: expr {
  if($expr.res != null)
    System.out.println("Result (A): " + $expr.res);
} #StatExpr;

expr returns [Double res = null]:
        e1=expr op=('*' | '/') e2=expr {
          Double res = null;
          Double e1 = $e1.res;
          Double e2 = $e2.res;
          if(e1 != null && e2 != null) {
            switch($op.getText()){
              case "*":
                res = e1 * e2;
                break;
              case "/":
                if(e2 == 0)
                  System.err.println("ERROR: Divide by Zero");
                else
                  res = e1 / e2;
                break;
            }
          }
          $res = res;
        } #ExprMultDiv

      | e1=expr op=('+' | '-') e2=expr {
        Double res = null;
        Double e1 = $e1.res;
        Double e2 = $e2.res;
        if(e1 != null && e2 != null) {
          switch($op.getText()){
            case "+":
              res = e1 + e2;
              break;
            case "-":
              res = e1 - e2;
              break;
          }
        }
        $res = res;
      } #ExprAddSub

      | '(' expr ')' {
        $res = $expr.res;
      }             #ExprParents

      | distance  {
        $res = $distance.res;
      }               #ExprDistance
      | Number {
        $res = Double.parseDouble($Number().getText());
      }                 #ExprNumber
      ;

distance returns [Double res]: 'distance' p1=point p2=point {
  Double p1x = $p1.x;
  Double p2x = $p2.x;
  Double p1y = $p1.y;
  Double p2y = $p2.y;
  if(p1x != null && p2x != null && p1y != null && p2y != null){
      $res = Math.sqrt(Math.pow(p1x - p2x, 2) + Math.pow(p1y - p2y, 2));
  }
};
point returns [Double x, Double y]: '(' e1=expr ',' e2=expr ')' {
  $x = $e1.res;
  $y = $e2.res;
};

Number: [0-9]+;
WS: [ \t\r\n]+ -> skip; 