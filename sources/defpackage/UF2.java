package defpackage;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.chrome.R;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UF2 {
    public final Context a;
    public final FrameLayout b;
    public final Camera.PreviewCallback c;
    public boolean d;
    public boolean e;
    public boolean f;
    public CF g;
    public final View h;
    public final View i;
    public final View j;
    public final SF2 k = new SF2(this);

    public UF2(Activity activity, IF2 if2, JF2 jf2) {
        this.a = activity;
        this.c = if2;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.b = frameLayout;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.f60180_resource_name_obfuscated_res_0x7f0e0234, (ViewGroup) null, false);
        ((ButtonCompat) inflate.findViewById(R.id.open_settings_button)).setOnClickListener(new TF2(this, activity));
        this.j = inflate;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        View inflate2 = LayoutInflater.from(activity).inflate(R.layout.f60190_resource_name_obfuscated_res_0x7f0e0235, (ViewGroup) null, false);
        ((ButtonCompat) inflate2.findViewById(R.id.ask_for_permission)).setOnClickListener(new QF2(jf2));
        this.h = inflate2;
        this.i = LayoutInflater.from(activity).inflate(R.layout.f60160_resource_name_obfuscated_res_0x7f0e0232, (ViewGroup) null, false);
    }

    public final void b() {
        if (this.f) {
            boolean z = this.d;
            FrameLayout frameLayout = this.b;
            if (!z || this.g != null) {
                if (z && this.g != null) {
                    a();
                    return;
                } else if (this.e) {
                    frameLayout.removeAllViews();
                    frameLayout.addView(this.h);
                    return;
                } else {
                    frameLayout.removeAllViews();
                    frameLayout.addView(this.j);
                    return;
                }
            }
            frameLayout.removeAllViews();
            CF cf = this.g;
            if (cf != null) {
                cf.b();
                this.g = null;
            }
            if (this.d) {
                Context context = this.a;
                CF cf2 = new CF(context, this.c, this.k);
                this.g = cf2;
                frameLayout.addView(cf2);
                frameLayout.addView(new DF(context));
                a();
            }
        }
    }

    public final void a() {
        final CF cf = this.g;
        if (cf == null) {
            return;
        }
        if (this.f && this.d) {
            if (cf.k == null) {
                HandlerThread handlerThread = new HandlerThread("CameraHandlerThread");
                cf.k = handlerThread;
                handlerThread.start();
            }
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= numberOfCameras) {
                    i2 = i;
                    break;
                }
                Camera.getCameraInfo(i2, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i = i2;
                i2++;
            }
            cf.i = i2;
            new Handler(cf.k.getLooper()).post(new Runnable() { // from class: AF
                @Override // java.lang.Runnable
                public final void run() {
                    int i3;
                    final Camera camera;
                    final CF cf2 = CF.this;
                    int i4 = cf2.i;
                    try {
                        camera = Camera.open(i4);
                    } catch (RuntimeException unused) {
                        if (i4 == -1) {
                            i3 = 1000;
                        } else {
                            i3 = ((DevicePolicyManager) cf2.a.getSystemService("device_policy")).getCameraDisabled(null) ? 1001 : 1002;
                        }
                        cf2.h.onError(i3, null);
                        camera = null;
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: BF
                        @Override // java.lang.Runnable
                        public final void run() {
                            CF cf3 = CF.this;
                            cf3.j = camera;
                            cf3.a();
                        }
                    });
                }
            });
            return;
        }
        cf.b();
    }
}
