package andy.sanko.opencv;

/**
 * Created by Administrator on 2016/1/11.
 */
public class OpenCVHelper {
    static {
        System.loadLibrary("OpenCV");
    }
    public static native int[] gray(int[] buf, int w, int h);
}
