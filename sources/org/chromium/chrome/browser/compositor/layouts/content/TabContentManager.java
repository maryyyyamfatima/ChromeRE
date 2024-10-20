package org.chromium.chrome.browser.compositor.layouts.content;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Size;
import com.android.chrome.R;
import defpackage.AX;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC1895Op0;
import defpackage.AbstractC5103f04;
import defpackage.AbstractC5177fD3;
import defpackage.AbstractC7239lD3;
import defpackage.C4187cM;
import defpackage.C4402cy1;
import defpackage.C4730dv3;
import defpackage.C7569mB;
import defpackage.E50;
import defpackage.OC3;
import defpackage.UC3;
import defpackage.VC3;
import defpackage.ZC3;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TabContentManager {
    public static final C7569mB p = new C7569mB("TabGridLayoutAndroid", "allow_to_refetch", true);
    public final float b;
    public final int c;
    public final E50 d;
    public int[] e;
    public long f;
    public final boolean h;
    public final C4187cM i;
    public final Context j;
    public boolean k;
    public ArrayList l;
    public int m;
    public int n;
    public int o;
    public final HashSet a = new HashSet();
    public final ArrayList g = new ArrayList();

    public static int c(int i, Context context, String str) {
        int integer;
        if (AbstractC5177fD3.b(context)) {
            integer = i == R.integer.0_resource_name_obfuscated_res_0x7f0c000b ? 2 : -1;
            if (i == R.integer.0_resource_name_obfuscated_res_0x7f0c0009) {
                integer = 8;
            }
        } else {
            integer = context.getResources().getInteger(i);
        }
        String f = AX.e().f(str);
        return f != null ? Integer.parseInt(f) : integer;
    }

    public TabContentManager(Context context, E50 e50, boolean z, C4187cM c4187cM) {
        this.j = context;
        this.d = e50;
        this.i = c4187cM;
        this.h = z;
        int c = c(R.integer.0_resource_name_obfuscated_res_0x7f0c000b, context, "thumbnails");
        this.c = c;
        float f = AbstractC1895Op0.b(context).d;
        float f2 = 1.0f;
        if (DeviceFormFactor.a(context)) {
            f2 = 1.0f / f;
        } else if (f > 1.5f) {
            f2 = 1.5f / f;
        }
        this.b = f2;
        this.e = new int[c];
    }

    public final long getNativePtr() {
        return this.f;
    }

    public final void f(final int i, Size size, final Callback callback, boolean z, final boolean z2) {
        if (this.h) {
            if (!z) {
                e(i, size, callback);
            } else {
                if (this.f == 0) {
                    return;
                }
                e(i, size, new Callback() { // from class: av3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        Tab m;
                        Bitmap bitmap = (Bitmap) obj;
                        TabContentManager tabContentManager = TabContentManager.this;
                        Callback callback2 = callback;
                        if (bitmap != null) {
                            tabContentManager.getClass();
                            callback2.onResult(bitmap);
                        }
                        C4187cM c4187cM = tabContentManager.i;
                        if (c4187cM == null || (m = ((AbstractC11276wz3) c4187cM.a).m(i)) == null) {
                            return;
                        }
                        tabContentManager.b(m, z2, new C4044bv3(callback2));
                    }
                });
            }
        }
    }

    public final void g() {
        Object obj = ThreadUtils.a;
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OC3 oc3 = (OC3) it.next();
                int i = this.o;
                ZC3 zc3 = oc3.a;
                zc3.getClass();
                Object obj2 = ThreadUtils.a;
                VC3 vc3 = zc3.H;
                vc3.getClass();
                PostTask.c(AbstractC5103f04.b, new UC3(i, SystemClock.elapsedRealtime() - vc3.a));
                zc3.H = null;
            }
            this.l = null;
        }
    }

    public final void e(int i, Size size, Callback callback) {
        this.m++;
        this.n++;
        TraceEvent.j(i, "GetTabThumbnailFromDisk");
        new C4730dv3(this, i, size, callback).c(AbstractC0185Bl.e);
    }

    public final void a(Tab tab) {
        if (this.f == 0 || !this.h) {
            return;
        }
        b(tab, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(org.chromium.chrome.browser.tab.Tab r21, boolean r22, defpackage.C4044bv3 r23) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.compositor.layouts.content.TabContentManager.b(org.chromium.chrome.browser.tab.Tab, boolean, bv3):void");
    }

    public final double d() {
        return AbstractC7239lD3.c(this.j);
    }

    public final void i(int i, AbstractList abstractList) {
        if (this.f != 0) {
            int min = Math.min(this.c, abstractList.size());
            if (min != this.e.length) {
                this.e = new int[min];
            }
            for (int i2 = 0; i2 < min; i2++) {
                this.e[i2] = ((Integer) abstractList.get(i2)).intValue();
            }
            N.MZoWkzRr(this.f, this, this.e, i);
        }
    }

    public final void h(int i) {
        long j = this.f;
        if (j != 0) {
            N.MZeSR4YP(j, this, i);
        }
    }

    public void notifyListenersOfThumbnailChange(int i) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((C4402cy1) it.next()).a.g.N(null);
        }
    }
}
