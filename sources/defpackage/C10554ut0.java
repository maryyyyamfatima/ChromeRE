package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.View;
import org.chromium.ui.dragdrop.DropDataAndroid;
import org.chromium.ui.dragdrop.DropDataContentProvider;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ut0 */
/* loaded from: classes2.dex */
public final class C10554ut0 implements InterfaceViewOnDragListenerC0226Bt0 {
    public int a;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public float k;
    public float l;
    public long m;
    public C8614pD3 n;

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C8614pD3 c8614pD3;
        if (!this.h) {
            C8614pD3 c8614pD32 = this.n;
            if (c8614pD32 != null && c8614pD32.b && dragEvent.getAction() == 3 && (c8614pD3 = this.n) != null) {
                Activity a = V60.a(c8614pD3.a.getContext());
                DragAndDropPermissions requestDragAndDropPermissions = a == null ? null : a.requestDragAndDropPermissions(dragEvent);
                if (requestDragAndDropPermissions != null && Build.VERSION.SDK_INT >= 24) {
                    requestDragAndDropPermissions.release();
                }
            }
            return false;
        }
        int action = dragEvent.getAction();
        if (action == 1) {
            this.k = dragEvent.getX();
            this.l = dragEvent.getY();
        } else if (action == 3) {
            this.i = true;
            float f = this.k;
            float f2 = this.l;
            float x = dragEvent.getX() - f;
            float y = dragEvent.getY() - f2;
            EI2.h(Math.round((float) Math.sqrt((y * y) + (x * x))), 51, "Android.DragDrop.FromWebContent.DropInWebContent.DistanceDip");
            EI2.k(SystemClock.elapsedRealtime() - this.m, "Android.DragDrop.FromWebContent.DropInWebContent.Duration");
        } else if (action == 4) {
            boolean result = dragEvent.getResult();
            if (!this.i) {
                EI2.k(SystemClock.elapsedRealtime() - this.m, "Android.DragDrop.FromWebContent.Duration.".concat(result ? "Success" : "Canceled"));
                EI2.h(this.j, 4, "Android.DragDrop.FromWebContent.TargetType");
            }
            if (!(!this.i && result)) {
                DropDataContentProvider.a();
            } else {
                synchronized (DropDataContentProvider.h) {
                    if (DropDataContentProvider.n == null) {
                        DropDataContentProvider.n = new Handler(Looper.getMainLooper());
                    }
                    DropDataContentProvider.n.postDelayed(new Runnable() { // from class: bu0
                        @Override // java.lang.Runnable
                        public final void run() {
                            DropDataContentProvider.a();
                        }
                    }, DropDataContentProvider.i);
                    DropDataContentProvider.o = SystemClock.elapsedRealtime();
                }
            }
            this.g = 0;
            this.a = 0;
            this.j = 0;
            this.h = false;
            this.i = false;
            this.m = -1L;
        }
        return false;
    }

    public static String a(DropDataAndroid dropDataAndroid) {
        boolean isEmpty = TextUtils.isEmpty(dropDataAndroid.a);
        GURL gurl = dropDataAndroid.b;
        if (isEmpty) {
            return gurl.i();
        }
        return dropDataAndroid.a + "\n" + gurl.i();
    }
}
