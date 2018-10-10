/**
 * Package b&agrave;i l&agrave;m cho C&acirc;u 2
 * TODO: Khai b&aacute;o c&aacute;c class, thu&#x1ed9;c t&iacute;nh v&agrave; ph&#x1b0;&#x1a1;ng th&#x1ee9;c nh&#x1b0; bi&#x1ec3;u &#x111;&#x1ed3; l&#x1edb;p c&#x1ee7;a C&acirc;u 2. 1 file ch&#x1ec9; khai b&aacute;o 1 class
 * TODO: Vi&#x1ebf;t comment v&agrave; khai b&aacute;o getter, setter &#x111;&#x1ea7;y &#x111;&#x1ee7; nh&#x1b0; y&ecirc;u c&#x1ea7;u &#x1edf; C&acirc;u 1
 * TODO: S&#x1eed; d&#x1ee5;ng s&#x1ed1; PI t&#x1ef1; &#x111;&#x1ecb;nh ngh&#x129;a d&ugrave;ng cho c&aacute;c ph&#x1b0;&#x1a1;ng th&#x1ee9;c getArea() v&agrave; getPerimeter()
 * @author cuong
 * @version 0.1
 */
package week4.task2;

class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());

        Circle circle = new Circle(2);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.toString());

        Square square = new Square(2);
        System.out.println(square.toString());
    }

}