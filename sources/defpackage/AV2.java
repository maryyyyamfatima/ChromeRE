package defpackage;

import android.app.ActivityManager;
import android.graphics.Point;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.google.vr.ndk.base.GvrApi;
import com.google.vr.ndk.base.GvrSurfaceView;
import java.lang.reflect.InvocationTargetException;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class AV2 implements GLSurfaceView.Renderer {
    public final GvrApi a;
    public GvrSurfaceView b;

    public AV2(GvrApi gvrApi) {
        if (gvrApi == null) {
            throw new IllegalArgumentException("GvrApi must be supplied for proper scanline rendering");
        }
        this.a = gvrApi;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Thread.currentThread().setPriority(10);
        int myTid = Process.myTid();
        int i = J9.a;
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                try {
                    ActivityManager.class.getMethod("setVrThread", Integer.TYPE).invoke(null, Integer.valueOf(myTid));
                } catch (IllegalAccessException | RuntimeException | InvocationTargetException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                    sb.append("Failed to invoke setVrThread: ");
                    sb.append(valueOf);
                    Log.e("J9", sb.toString());
                }
            } catch (NoSuchMethodException | RuntimeException e2) {
                if (!"NMR1".equals(Build.VERSION.CODENAME) && Build.VERSION.SDK_INT < 25) {
                    z = false;
                }
                if (z) {
                    String valueOf2 = String.valueOf(e2);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 38);
                    sb2.append("Failed to acquire setVrThread method: ");
                    sb2.append(valueOf2);
                    Log.e("J9", sb2.toString());
                } else {
                    String valueOf3 = String.valueOf(e2);
                    StringBuilder sb3 = new StringBuilder(valueOf3.length() + 38);
                    sb3.append("Failed to acquire setVrThread method: ");
                    sb3.append(valueOf3);
                    Log.w("J9", sb3.toString());
                }
            }
        }
        this.a.onSurfaceCreatedReprojectionThread();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.a.onSurfaceChangedReprojectionThread();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Point renderReprojectionThread = this.a.renderReprojectionThread();
        if (renderReprojectionThread != null) {
            KK3.a(new RunnableC12132zV2(this, renderReprojectionThread.x, renderReprojectionThread.y));
        }
    }
}
