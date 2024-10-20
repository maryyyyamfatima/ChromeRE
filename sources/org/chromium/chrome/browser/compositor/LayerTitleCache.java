package org.chromium.chrome.browser.compositor;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import com.android.chrome.R;
import defpackage.AbstractC11276wz3;
import defpackage.C2846Vx1;
import defpackage.C9537rv0;
import defpackage.InterfaceC10590uz3;
import defpackage.MN3;
import defpackage.VH0;
import defpackage.WH0;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LayerTitleCache {
    public static int k = 1;
    public final Context a;
    public InterfaceC10590uz3 b;
    public final SparseArray c = new SparseArray();
    public final int d;
    public long e;
    public final ResourceManager f;
    public WH0 g;
    public final VH0 h;
    public final MN3 i;
    public final MN3 j;

    public LayerTitleCache(Context context, ResourceManager resourceManager) {
        this.a = context;
        this.f = resourceManager;
        Resources resources = context.getResources();
        this.e = N.MTbG5FQ5(this, resources.getDimensionPixelOffset(R.dimen.f28590_resource_name_obfuscated_res_0x7f080097), resources.getDimensionPixelSize(R.dimen.f41570_resource_name_obfuscated_res_0x7f0807ba), resources.getDimensionPixelSize(R.dimen.f41560_resource_name_obfuscated_res_0x7f0807b9), R.drawable.f53450_resource_name_obfuscated_res_0x7f09049d, R.drawable.f53460_resource_name_obfuscated_res_0x7f09049e, resourceManager);
        this.d = resources.getDimensionPixelSize(R.dimen.f29580_resource_name_obfuscated_res_0x7f08011f);
        this.i = new MN3(context, false);
        this.j = new MN3(context, true);
        this.h = new VH0();
    }

    public final long getNativePtr() {
        return this.e;
    }

    public final void buildUpdatedTitle(int i) {
        Tab m;
        InterfaceC10590uz3 interfaceC10590uz3 = this.b;
        if (interfaceC10590uz3 == null || (m = ((AbstractC11276wz3) interfaceC10590uz3).m(i)) == null || m.isDestroyed()) {
            return;
        }
        b(m, "");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:1|(1:93)(1:5)|6|(2:8|(2:10|(1:12)(24:13|14|(1:16)|(1:18)(1:91)|19|(2:21|(1:23))|24|25|26|27|(4:29|30|31|32)(1:88)|33|(4:35|36|37|38)(1:82)|39|40|41|42|(6:47|48|49|(3:51|(1:68)(1:55)|56)(1:69)|(5:58|(1:60)|61|(1:63)(1:65)|64)|66)|71|48|49|(0)(0)|(0)|66)))|92|14|(0)|(0)(0)|19|(0)|24|25|26|27|(0)(0)|33|(0)(0)|39|40|41|42|(7:44|47|48|49|(0)(0)|(0)|66)|71|48|49|(0)(0)|(0)|66|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0157, code lost:            android.util.Log.w("TitleBitmapFactory", "InflateException while building favicon texture.");     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0162, code lost:            r2 = r9;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015d, code lost:            android.util.Log.e("TitleBitmapFactory", "OutOfMemoryError while building favicon texture.");     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f3, code lost:            r23 = r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00fc, code lost:            r23 = r2;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d A[Catch: InflateException -> 0x00f3, OutOfMemoryError -> 0x00fc, TRY_ENTER, TRY_LEAVE, TryCatch #8 {InflateException -> 0x00f3, OutOfMemoryError -> 0x00fc, blocks: (B:26:0x0094, B:29:0x009d), top: B:25:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4 A[Catch: InflateException -> 0x00f5, OutOfMemoryError -> 0x00fe, TRY_LEAVE, TryCatch #6 {InflateException -> 0x00f5, OutOfMemoryError -> 0x00fe, blocks: (B:32:0x00a4, B:33:0x00ad, B:35:0x00c4), top: B:31:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118 A[Catch: InflateException -> 0x0157, OutOfMemoryError -> 0x015d, TryCatch #7 {InflateException -> 0x0157, OutOfMemoryError -> 0x015d, blocks: (B:42:0x0107, B:44:0x0118, B:47:0x011f, B:48:0x0150, B:71:0x013e), top: B:41:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(org.chromium.chrome.browser.tab.Tab r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.compositor.LayerTitleCache.b(org.chromium.chrome.browser.tab.Tab, java.lang.String):java.lang.String");
    }

    public final void c(int i) {
        SparseArray sparseArray = this.c;
        C2846Vx1 c2846Vx1 = (C2846Vx1) sparseArray.get(i);
        if (c2846Vx1 == null) {
            return;
        }
        ResourceManager resourceManager = c2846Vx1.d.f;
        if (resourceManager != null) {
            C9537rv0 c9537rv0 = (C9537rv0) resourceManager.a.get(2);
            c9537rv0.e(c2846Vx1.a.a);
            c9537rv0.e(c2846Vx1.b.a);
        }
        sparseArray.remove(i);
        long j = this.e;
        if (j == 0) {
            return;
        }
        N.Mn77UQtR(j, this, i, -1, -1, false, false);
    }

    public final void a(int i) {
        ResourceManager resourceManager;
        SparseArray sparseArray = this.c;
        C2846Vx1 c2846Vx1 = (C2846Vx1) sparseArray.get(i);
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            C2846Vx1 c2846Vx12 = (C2846Vx1) sparseArray.get(sparseArray.keyAt(i2));
            if (c2846Vx12 != c2846Vx1 && (resourceManager = c2846Vx12.d.f) != null) {
                C9537rv0 c9537rv0 = (C9537rv0) resourceManager.a.get(2);
                c9537rv0.e(c2846Vx12.a.a);
                c9537rv0.e(c2846Vx12.b.a);
            }
        }
        sparseArray.clear();
        VH0 vh0 = this.h;
        vh0.a = null;
        vh0.b = null;
        vh0.c = null;
        vh0.d = null;
        if (c2846Vx1 != null) {
            sparseArray.put(i, c2846Vx1);
        }
        long j = this.e;
        if (j == 0) {
            return;
        }
        N.MearVShy(j, this, i);
    }
}
