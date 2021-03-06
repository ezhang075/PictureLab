/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      
      beach.keepOnlyBlue();
      beach.explore();
      
   }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
 
   public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
   public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  
  public static void testCopy()
  {
      //Picture louisXVI = new Picture("snowman.jpg");
      //louisXVI.copy(louisXVI, 10, 10, 60, 160, 180, 230);
      //louisXVI.explore();
      
      //Picture seagull = new Picture("seagull.jpg");
      //seagull.explore();
      //Picture flower = new Picture("flower1.jpg");
      //seagull.copy(flower,10,100);
      //seagull.explore();
      //Picture snowman = new Picture("snowman.jpg");
      //seagull.copy(snowman,200,200);
      //seagull.explore();
      
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
   Picture caterpillar = new Picture("caterpillar.jpg");
   caterpillar.explore();
   caterpillar.mirrorHorizontalBottomToTop();
   caterpillar.explore();
  }
  
  public static void testMirrorArms()
  {
   Picture snowman = new Picture("snowman.jpg");
   snowman.explore();
   snowman.mirrorArms();
   snowman.explore();
  }
  
  public static void testMirrorRightArm()
  {
   Picture snowman = new Picture("snowman.jpg");
   snowman.explore();
   snowman.mirrorRightArm();
   snowman.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(6);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testMirrorVerticalRightToLeft();
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}