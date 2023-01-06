package com.company;

import java.applet.Applet;
import java.awt.*;

public class Draw extends Applet {
    Thread t=new Thread();

    public void init()
    {
        super.init();
        resize(1350,650);
        setBackground(Color.white);

    }

    public void run()
    {
        t.start();
    }

    //instance of the primitives
    com.company.GraphicsPrimitives gp = new com.company.GraphicsPrimitives();

    public void paint(Graphics g)
    {
        //Sky
        Color c3 = new Color(136, 224, 225);//set color for roof
        g.setColor(c3);
        g.fillArc (100,15,700,850,0,180);

        //cloud
        g.setColor (Color.white); // cloud 1
        g.fillArc (90,300,80,50,0,360);
        g.fillArc (100,320,80,50,0,360);
        g.fillArc (130,300,80,50,0,360);
        g.fillArc (110,320,80,50,0,360);
        //Cloud 2
        g.fillArc (300,150,50,70,0,360);
        g.fillArc (320,160,90,60,0,360);
        g.fillArc (340,150,70,70,0,360);
        g.fillArc (330,160,100,60,0,360);

        //Cloud 3
        g.fillArc (720,350,80,60,0,360);

        // Cloud 4
        g.fillArc (720,250,50,30,0,360);

        //Ground
        Color c1 = new Color(190, 203, 28);
        g.setColor(c1);
        g.fillArc (50,430,795,170,0,360);
        Color c2 = new Color(127, 125, 16);
        g.setColor(c2);
        g.drawArc(50,430,795,170,0,360);

        // The small small dot on the ground floor
        Color d6 = new Color(107, 122, 0);
        g.setColor(d6);
        g.fillArc(373,475,9,7,0,360);
        Color d7 = new Color(107, 122, 0);
        g.setColor(d7);
        g.fillArc(385,485,4,3,0,360);
        Color d8 = new Color(107, 122, 0);
        g.setColor(d8);
        g.fillArc(410,485,9,7,0,360);
        Color d9 = new Color(107, 122, 0);
        g.setColor(d9);
        g.fillArc(420,481,3,6,0,360);
        Color e1 = new Color(107, 122, 0);
        g.setColor(e1);
        g.fillArc(170,550,10,8,0,360);
        Color e2 = new Color(107, 122, 0);
        g.setColor(e2);
        g.fillArc(230,560,10,8,0,360);
        Color e3 = new Color(107, 122, 0);
        g.setColor(e3);
        g.fillArc(600,580,10,8,0,360);
        Color e5 = new Color(107, 122, 0);
        g.setColor(e5);
        g.fillArc(610,575,4,8,0,360);
        Color e4 = new Color(107, 122, 0);
        g.setColor(e4);
        g.fillArc(550,575,10,8,0,360);
        Color e6 = new Color(156, 171, 0);
        g.setColor(e6);
        g.fillArc(820,520,10,8,0,360);
        Color e7 = new Color(156, 171, 0);
        g.setColor(e7);
        g.fillArc(800,540,10,8,0,360);

        //Tree 1
        Color c4 = new Color(89, 185, 77);//set color for roof
        g.setColor(c4);
        int x[]={230,130,350};
        int y[]={120,420,420};
        g.fillPolygon(x,y,3);
        //Tree 2
        Color c5 = new Color(141, 200, 50);
        g.setColor(c5);
        int a[]={290,210,390};
        int b[]={150,420,420};
        g.fillPolygon(a,b,3);

        //Building
        Color c6 = new Color(249, 210, 213);
        g.setColor(c6);
        g.fillRect(300,250,7,200);
        g.fillRect(540,250,7,200);
        //main building
        Color d3 = new Color(243, 122, 139);
        g.setColor(d3);
        g.fillRect(307,250,233,200);
        //Base
        Color c7 = new Color(180, 203, 174);
        g.setColor(c7);
        gp.horizontalLine(300,450,490,450,g);

        //Door
        Color c9 = new Color(223, 105, 117);
        g.setColor(c9);
        g.fillRect(330,300,80,145);//outer
        Color d1 = new Color(253, 203, 212);
        g.setColor(Color.black);
        g.drawRect(330,300,80,145);//outer Line
        g.setColor(d1);
        g.fillRect(335,310,70,135);//Inner
        g.setColor(Color.black);
        g.drawRect(335,310,70,135);//Inner Line
        Color d2 = new Color(190, 239, 246);
        g.setColor(d2);
        g.fillRect(345,330,50,30);//Inner window Door
        g.setColor(Color.black);
        g.drawRect(345,330,50,30);//Inner window door Line
        //door Knob
        Color d4 = new Color(156, 155, 150);
        g.setColor(d4);
        g.fillArc(337,375,10,10,0,360);
        g.setColor(Color.black);
        g.fillArc(339,377,5,5,0,360);

        //window
        Color f1 = new Color (255,81,108);
        g.setColor(f1);
        g.fillRect(455,320,65,65);//outer
        g.setColor(Color.black);
        g.drawRect(455,320,65,65);//outerline
        g.setColor(d2);
        g.fillRect(460,325,55,55);//outer

        //bridge
        Color d5 = new Color(145, 16, 44);
        g.setColor(d5);
        g.fillRect(485,325,5,55);
        g.fillRect(460,350,55,5);

        // The small pillar on the roof
        Color c11 = new Color(216, 111, 54);
        g.setColor(c11);
        g.fillRect(325,195,5,6);
        Color c12 = new Color(145, 35, 36);
        g.setColor(c12);
        g.fillRect(330,195,5,6);
        Color c13 = new Color(193, 107, 72);
        g.setColor(c13);
        g.fillRect(335,195,5,6);
        Color c14 = new Color(204, 111, 77);
        g.setColor(c14);
        g.fillRect(340,195,5,6);
        Color c15 = new Color(145, 35, 36);
        g.setColor(c15);
        g.fillRect(345,195,5,6);
        Color c16 = new Color(184, 109, 77);
        g.setColor(c16);
        g.fillRect(350,195,5,6);
        Color c17 = new Color(184, 109, 77);
        g.setColor(c17);
        g.fillRect(325,190,5,6);
        Color c18 = new Color(204, 111, 77);
        g.setColor(c18);
        g.fillRect(330,190,5,6);
        Color c19 = new Color(253, 160, 126);
        g.setColor(c19);
        g.fillRect(335,190,5,6);
        Color c20 = new Color(253, 160, 126);
        g.setColor(c20);
        g.fillRect(340,190,5,6);
        Color c21 = new Color(204, 111, 77);
        g.setColor(c21);
        g.fillRect(345,190,5,6);
        Color c22 = new Color(204, 111, 77);
        g.setColor(c22);
        g.fillRect(350,190,5,6);
        Color c23 = new Color(216, 111, 54);
        g.setColor(c23);
        g.fillRect(325,185,5,6);
        Color c24 = new Color(145, 35, 36);
        g.setColor(c24);
        g.fillRect(330,185,5,6);
        Color c25 = new Color(193, 107, 72);
        g.setColor(c25);
        g.fillRect(335,185,5,6);
        Color c26 = new Color(204, 111, 77);
        g.setColor(c26);
        g.fillRect(340,185,5,6);
        Color c27 = new Color(145, 35, 36);
        g.setColor(c27);
        g.fillRect(345,185,5,6);
        Color c28 = new Color(184, 109, 77);
        g.setColor(c28);
        g.fillRect(350,185,5,6);
        Color c29 = new Color(184, 109, 77);
        g.setColor(c29);
        g.fillRect(325,180,5,6);
        Color c30 = new Color(204, 111, 77);
        g.setColor(c30);
        g.fillRect(330,180,5,6);
        Color c31 = new Color(253, 160, 126);
        g.setColor(c31);
        g.fillRect(335,180,5,6);
        Color c32 = new Color(253, 160, 126);
        g.setColor(c32);
        g.fillRect(340,180,5,6);
        Color c33 = new Color(204, 111, 77);
        g.setColor(c33);
        g.fillRect(345,180,5,6);
        Color c34 = new Color(204, 111, 77);
        g.setColor(c34);
        g.fillRect(350,180,5,6);
        Color c35 = new Color(216, 111, 54);
        g.setColor(c35);
        g.fillRect(325,175,5,6);
        Color c36 = new Color(145, 35, 36);
        g.setColor(c36);
        g.fillRect(330,175,5,6);
        Color c37 = new Color(193, 107, 72);
        g.setColor(c37);
        g.fillRect(335,175,5,6);
        Color c38 = new Color(204, 111, 77);
        g.setColor(c38);
        g.fillRect(340,175,5,6);
        Color c39 = new Color(145, 35, 36);
        g.setColor(c39);
        g.fillRect(345,175,5,6);
        Color c40 = new Color(184, 109, 77);
        g.setColor(c40);
        g.fillRect(350,175,5,6);
        Color c41 = new Color(194, 29, 61);
        g.setColor(c41);
        g.fillRect(325,170,5,6);
        Color c42 = new Color(194, 29, 61);
        g.setColor(c42);
        g.fillRect(330,170,5,6);
        Color c43 = new Color(194, 29, 61);
        g.setColor(c43);
        g.fillRect(335,170,5,6);
        Color c44 = new Color(194, 29, 61);
        g.setColor(c44);
        g.fillRect(340,170,5,6);
        Color c45 = new Color(194, 29, 61);
        g.setColor(c45);
        g.fillRect(345,170,5,6);
        Color c46 = new Color(194, 29, 61);
        g.setColor(c46);
        g.fillRect(350,170,5,6);

        //Roof
        g.setColor(Color.black);
        int c[]={310,540,560,290};
        int d[]={200,200,250,250};
        g.drawPolygon(c,d,4);
        //Paint Roof
        Color c8 = new Color(226, 35, 78);
        g.setColor(c8);
        g.fillPolygon(c,d,4);
        //The base on the roof
        Color p8 = new Color(149, 33, 54);
        g.setColor(p8);
        gp.horizontalLine(308,200,535,200,g);

        // The slate on top of the roof
        Color p9 = new Color(149, 33, 54);
        g.setColor(p9);
        g.fillRect(307,196,3,20);
        g.fillRect(310,200,10,15);
        g.fillRect(310+11,200,10,15);
        g.fillRect(310+22,200,10,15);
        g.fillRect(310+33,200,10,15);
        g.fillRect(310+44,200,10,15);
        g.fillRect(310+55,200,10,15);
        g.fillRect(310+66,200,10,15);
        g.fillRect(310+77,200,10,15);
        g.fillRect(310+88,200,10,15);
        g.fillRect(310+99,200,10,15);
        g.fillRect(310+110,200,10,15);
        g.fillRect(310+121,200,10,15);
        g.fillRect(310+132,200,10,15);
        g.fillRect(310+143,200,10,15);
        g.fillRect(310+154,200,10,15);
        g.fillRect(310+165,200,10,15);
        g.fillRect(310+176,200,10,15);
        g.fillRect(310+187,200,10,15);
        g.fillRect(310+198,200,10,15);
        g.fillRect(310+207,200,10,15);
        g.fillRect(310+220,200,10,15);
        g.fillRect(310+230,197,4,20);
        g.setColor(Color.red);
        g.fillRect(303,215,243,1);
        g.setColor(p9);
        g.fillRect(300,216,10,15);
        g.fillRect(310,216,10,15);
        g.fillRect(310+11,216,10,15);
        g.fillRect(310+22,216,10,15);
        g.fillRect(310+33,216,10,15);
        g.fillRect(310+44,216,10,15);
        g.fillRect(310+55,216,10,15);
        g.fillRect(310+66,216,10,15);
        g.fillRect(310+77,216,10,15);
        g.fillRect(310+88,216,10,15);
        g.fillRect(310+99,216,10,15);
        g.fillRect(310+110,216,10,15);
        g.fillRect(310+121,216,10,15);
        g.fillRect(310+132,216,10,15);
        g.fillRect(310+143,216,10,15);
        g.fillRect(310+154,216,10,15);
        g.fillRect(310+165,216,10,15);
        g.fillRect(310+176,216,10,15);
        g.fillRect(310+187,216,10,15);
        g.fillRect(310+198,216,10,15);
        g.fillRect(310+207,216,10,15);
        g.fillRect(310+220,216,10,15);
        g.fillRect(310+231,216,10,15);
        g.setColor(Color.red);
        g.fillRect(300,230,250,1);
        g.setColor(p9);
        g.fillRect(295,230,10,20);
        g.fillRect(300,230,10,20);
        g.fillRect(310,230,10,20);
        g.fillRect(310+11,230,10,20);
        g.fillRect(310+22,230,10,20);
        g.fillRect(310+33,230,10,20);
        g.fillRect(310+44,230,10,20);
        g.fillRect(310+55,230,10,20);
        g.fillRect(310+66,230,10,20);
        g.fillRect(310+77,230,10,20);
        g.fillRect(310+88,230,10,20);
        g.fillRect(310+99,230,10,20);
        g.fillRect(310+110,230,10,20);
        g.fillRect(310+121,230,10,20);
        g.fillRect(310+132,230,10,20);
        g.fillRect(310+143,230,10,20);
        g.fillRect(310+154,230,10,20);
        g.fillRect(310+165,230,10,20);
        g.fillRect(310+176,230,10,20);
        g.fillRect(310+187,230,10,20);
        g.fillRect(310+198,230,10,20);
        g.fillRect(310+207,230,10,20);
        g.fillRect(310+220,230,10,20);
        g.fillRect(310+231,230,10,20);
        g.fillRect(310+238,230,10,20);
        g.setColor(Color.red);
        g.fillRect(300,230,250,1);

        //Fence around house
        int s[]={110,115,120};
        int v[]={110+40,115+40,120+40};
        int w[]={110+80,115+80,120+80};
        int z[]={110+120,115+120,120+120};
        int h[]={110+160,115+160,120+160};
        int t[]={385,370,385};
        g.setColor(c7);
        g.fillRect(100,395,200,10);
        g.fillPolygon(s,t,3);
        g.fillPolygon(v,t,3);
        g.fillPolygon(w,t,3);
        g.fillPolygon(z,t,3);
        g.fillPolygon(h,t,3);
        g.fillRect(110,385,10,90);
        g.fillRect(110+40,385,10,90);
        g.fillRect(110+80,385,10,90);
        g.fillRect(110+120,385,10,90);
        g.fillRect(110+160,385,10,90);

        // Right Fence
        Color c90 = new Color(180, 203, 174);
        g.setColor(c90);
        g.fillRect(547,395,262,10);
        int v1[]={110+460,115+460,120+460};
        int w1[]={110+500,115+500,120+500};
        int z1[]={110+540,115+540,120+540};
        int h1[]={110+580,115+580,120+580};
        int x1[]={110+620,115+620,120+620};
        int y1[]={110+680,115+680,120+680};
        g.fillPolygon(v1,t,3);
        g.fillPolygon(w1,t,3);
        g.fillPolygon(z1,t,3);
        g.fillPolygon(h1,t,3);
        g.fillPolygon(x1,t,3);
        g.fillPolygon(y1,t,3);
        g.fillRect(110+460,385,10,90);
        g.fillRect(110+500,385,10,90);
        g.fillRect(110+540,385,10,90);
        g.fillRect(110+580,385,10,90);
        g.fillRect(110+620,385,10,90);
        g.fillRect(110+680,385,10,90);


        //The nails on the fence (Left)
        g.setColor(Color.black);
        g.fillArc(112,395,5,5,0,360);
        g.fillArc(112+40,395,5,5,0,360);
        g.fillArc(112+80,395,5,5,0,360);
        g.fillArc(112+120,395,5,5,0,360);
        g.fillArc(112+160,395,5,5,0,360);

        //The nails on the fence (Right)
        g.fillArc(112+460,395,5,5,0,360);
        g.fillArc(112+500,395,5,5,0,360);
        g.fillArc(112+540,395,5,5,0,360);
        g.fillArc(112+580,395,5,5,0,360);
        g.fillArc(112+620,395,5,5,0,360);
        g.fillArc(112+680,395,5,5,0,360);

        // The Pipe behind the house on the left
        Color c88 = new Color(165, 162, 169);
        g.setColor(c88);
        gp.verticalLine(297,257,297,390,g);
        gp.negativeLine(297,390,310,420,g);
        gp.verticalLine(285,403,287,430,g);
        Color c89 = new Color(180, 203, 174);
        g.setColor(c89);
        gp.horizontalLine(455,409,570,409,g);
        Color c91 = new Color(180, 203, 174);
        g.setColor(c91);
        gp.verticalLine(460,410,460,450,g);

        //Flowers on the flower pot
        Color c115 = new Color(111, 179, 80);//set color for roof
        g.setColor(c115);
        g.fillArc (465,410,85,80,0,180);
        g.fillArc (555,410,85,80,0,180);
        //The flowers outside the flower pot
        g.fillArc (635,420,80,120,0,180);
        g.fillArc (710,420,100,120,0,180);

        //The smallest within the flowers on the flower pot
        Color c116 = new Color(123, 143, 3);//set color for roof
        g.setColor(c116);
        g.fillArc (515,420,50,50,0,180);
        g.fillArc (595,420,50,50,0,180);
        g.fillArc (685,445,70,75,0,180);

        // Draw the flower pot
        Color c92 = new Color(244, 176, 101);
        g.setColor(c92);
        g.fillRect(465,445,180,30);
        Color c93 = new Color(171, 145, 122);
        g.setColor(c93);
        g.fillRect(465,443,180,4);
        g.setColor(Color.black);
        g.drawLine(580, 475, 580, 444);

        // The small small stones on the flower pot
        Color e11 = new Color(157, 87, 61);
        g.setColor(e11);
        g.fillArc(470,465,15,8,0,360);
        g.fillArc(470,450,6,8,0,360);
        g.fillArc(480,455,15,8,0,360);
        g.fillArc(520,448,17,15,0,360);
        g.fillArc(550,460,20,10,0,360);
        g.fillArc(550,450,10,5,0,360);
        g.fillArc(585,448,10,7,0,360);
        g.fillArc(590,460,15,10,0,360);
        g.fillArc(605,453,15,7,0,360);

        // Down fence
        g.setColor(c7);
        g.fillRect(230,430,50,10);
        g.setColor(Color.white);
        g.fillRect(240,440,30,5);

        //Nail on the down fence
        g.setColor(Color.black);
        g.fillArc(112+160,433,5,5,0,360);

        // Some small small dot infront of the house
        Color e12 = new Color(197, 104, 123);
        g.setColor(e12);
        g.fillArc(415,425,15,8,0,360);
        g.fillArc(430,415,13,7,0,360);
        g.fillArc(440,430,10,5,0,360);

        //Flowers on the left side of the house
        Color c111 = new Color(111, 179, 80);//set color for roof
        g.setColor(c111);
        g.fillArc (70,425,90,95,0,197);
        Color c113 = new Color(111, 179, 80);//set color for roof
        g.setColor(c113);
        g.fillArc (150,430,90,95,0,178);
        Color c112 = new Color(207, 210, 35);//set color for roof
        g.setColor(c112);
        g.fillArc (110,450,60,60,0,180);

        //The log on the left side of the house
        Color c11111111111 = new Color(183, 83, 33);
        g.setColor(c11111111111);
        g.fillRect(170,470,50,45);
        Color c11111 = new Color(191, 161, 127);//set color for roof
        g.setColor(c11111);
        g.fillArc (120,470,90,90,0,180);
        Color c111111 = new Color(178, 178, 150);//set color for roof
        g.setColor(c111111);
        g.fillArc (125,475,80,80,0,180);
        Color c1111111 = new Color(192, 149, 94);//set color for roof
        g.setColor(c1111111);
        g.fillArc (130,480,70,70,0,180);
        Color c11111111 = new Color(231, 215, 179);//set color for roof
        g.setColor(c11111111);
        g.fillArc (135,485,60,60,0,180);
        Color c111111111 = new Color(183, 83, 33);
        g.setColor(c111111111);
        g.drawLine(170,470,320, 470);
        g.drawLine(190,515,320, 515);
        g.fillArc (320,470,1,46,0,350);
        Color c1111111111 = new Color(183, 83, 33);
        g.setColor(c1111111111);
        g.fillRect(210,485,110,30);
        Color c111111111111 = new Color(63, 74, 31);
        g.setColor(c111111111111);
        g.fillRect(220,470,100,15);


        //Drawing the branches of the tree
        Color p5 = new Color(188, 98, 38);
        g.setColor(p5);
        gp.negativeLine(120+600,400,350+470,300,g);
        gp.positiveLine(330+300,30+250,470+250,500+300,g);
        gp.positiveLine(330+310,30+290,470+240,500+330,g);

        //Drawing the big tree on the right hand side of the house
        Color p1 = new Color(188, 98, 38);
        g.setColor (p1);
        int i [] = {50+635,60+670,70+635,80+670};
        int j [] = {515,220,220,520};
        g.fillPolygon (i, j, 4);
        Color p2 = new Color(24, 13, 17);
        g.setColor (p2);
        g.fillArc (705,430,20,30,0,360);
        Color p4 = new Color(68, 141, 39);
        g.setColor (p4);
        g.fillArc (590,200,250,100,0,360);
        g.fillArc (590,230,250,100,0,360);
        g.fillArc (585,235,100,50,0,360);
        g.fillArc (745,240,100,50,0,360);
        Color p3 = new Color(109, 169, 69);
        g.setColor (p3);
        g.fillArc (590,210,250,100,0,360);

        //The short log on the right hand side of the house
        Color p10 = new Color(188, 98, 38);
        g.setColor (p10);
        int c233[]={610,650,670,580};
        int d23[]={470,470,496+10,495+10};
        g.fillPolygon(c233,d23,4);
        Color p11 = new Color(202, 143, 149);
        g.setColor (p11);
        g.fillArc (608,468,44,3,0,360);

    }
}
