package org.chromium.content.browser;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC1895Op0;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC7682mX2;
import defpackage.C10191tp4;
import defpackage.C8026nX2;
import defpackage.InterfaceC11179wj;
import defpackage.InterfaceC7338lX2;
import java.util.WeakHashMap;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ScreenOrientationProviderImpl implements InterfaceC11179wj {
    public InterfaceC7338lX2 a;
    public final WeakHashMap g = new WeakHashMap();
    public final WeakHashMap h = new WeakHashMap();
    public final WeakHashMap i = new WeakHashMap();

    public static ScreenOrientationProviderImpl getInstance() {
        return AbstractC7682mX2.a;
    }

    public static int b(byte b, WindowAndroid windowAndroid, Activity activity) {
        AbstractC1895Op0 b2;
        switch (b) {
            case 0:
                return -1;
            case 1:
                return 1;
            case 2:
                return 9;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return 0;
            case 4:
                return 8;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return 10;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                if (windowAndroid != null) {
                    b2 = windowAndroid.i;
                } else {
                    b2 = AbstractC1895Op0.b(activity);
                }
                int i = b2.g;
                if (i == 0 || i == 2) {
                    Point point = b2.c;
                    return point.y >= point.x ? 1 : 0;
                }
                Point point2 = b2.c;
                return point2.y < point2.x ? 1 : 0;
            default:
                AbstractC4851eH1.f("ScreenOrientation", "Trying to lock to unsupported orientation!", new Object[0]);
                return -1;
        }
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (i == 6) {
            this.h.remove(activity);
        }
    }

    public final void a(WebContents webContents, boolean z, byte b) {
        C10191tp4 e = C10191tp4.e(webContents);
        WeakHashMap weakHashMap = this.i;
        C8026nX2 c8026nX2 = (C8026nX2) weakHashMap.get(webContents);
        if (c8026nX2 != null && !c8026nX2.j) {
            c8026nX2.g.a.d(c8026nX2);
            c8026nX2.j = true;
        }
        weakHashMap.put(webContents, new C8026nX2(this, e, z, b));
    }

    public final void lockOrientationForWebContents(WebContents webContents, byte b) {
        WindowAndroid Q0 = webContents.Q0();
        if (Q0 == null) {
            a(webContents, true, b);
        } else {
            c(Q0, b);
        }
    }

    public final void c(WindowAndroid windowAndroid, byte b) {
        Activity activity;
        int b2;
        if (windowAndroid == null || (activity = (Activity) windowAndroid.k().get()) == null || (b2 = b(b, windowAndroid, activity)) == -1) {
            return;
        }
        d(b2, activity, true);
    }

    public final void unlockOrientationForWebContents(WebContents webContents) {
        WindowAndroid Q0 = webContents.Q0();
        if (Q0 == null) {
            a(webContents, false, (byte) 0);
        } else {
            e(Q0);
        }
    }

    public final void e(WindowAndroid windowAndroid) {
        Activity activity;
        if (windowAndroid == null || (activity = (Activity) windowAndroid.k().get()) == null) {
            return;
        }
        WeakHashMap weakHashMap = this.g;
        int b = b(weakHashMap.containsKey(activity) ? ((Byte) weakHashMap.get(activity)).byteValue() : (byte) 0, windowAndroid, activity);
        if (b == -1) {
            try {
                b = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128).screenOrientation;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                d(b, activity, false);
                throw th;
            }
        }
        d(b, activity, false);
    }

    public boolean isOrientationLockEnabled() {
        InterfaceC7338lX2 interfaceC7338lX2 = this.a;
        if (interfaceC7338lX2 == null) {
            return true;
        }
        interfaceC7338lX2.b();
        return false;
    }

    public final void d(int i, Activity activity, boolean z) {
        WeakHashMap weakHashMap = this.h;
        if (weakHashMap.containsKey(activity)) {
            weakHashMap.put(activity, Pair.create(Boolean.valueOf(z), Integer.valueOf(i)));
            return;
        }
        InterfaceC7338lX2 interfaceC7338lX2 = this.a;
        if (interfaceC7338lX2 != null) {
            if (z) {
                interfaceC7338lX2.b();
                return;
            } else if (!z && !interfaceC7338lX2.a(activity, i)) {
                return;
            }
        }
        activity.setRequestedOrientation(i);
    }
}
