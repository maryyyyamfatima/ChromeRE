package defpackage;

import android.util.Pair;
import android.util.SparseBooleanArray;
import java.io.File;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.base.PathUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ND3 extends AbstractC0185Bl {
    public final Callback h;
    public String[] i;
    public String[] j;
    public final InterfaceC0079Ap3 k;
    public SparseBooleanArray l;
    public final /* synthetic */ OD3 m;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        if (this.m.g) {
            return null;
        }
        this.i = OA3.a().list();
        this.j = new File(PathUtils.getThumbnailCacheDirectory()).list();
        this.l = (SparseBooleanArray) this.k.get();
        return null;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void j(Object obj) {
        synchronized (OD3.i) {
            OD3.l = null;
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        String[] strArr;
        if (this.m.g) {
            return;
        }
        DD3 a = ED3.a();
        ArrayList arrayList = new ArrayList();
        String[] strArr2 = this.i;
        if (strArr2 != null) {
            for (String str : strArr2) {
                Pair b = QA3.b(str);
                if (b != null) {
                    int intValue = ((Integer) b.first).intValue();
                    if (a.b(intValue) == null && !this.l.get(intValue)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        this.h.onResult(arrayList);
        if (this.m.f != null && (strArr = this.j) != null) {
            for (String str2 : strArr) {
                try {
                    int parseInt = Integer.parseInt(str2);
                    if (a.b(parseInt) == null && !this.l.get(parseInt)) {
                        this.m.f.h(parseInt);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        synchronized (OD3.i) {
            OD3.l = null;
        }
    }

    public ND3(OD3 od3, Callback callback, InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.m = od3;
        this.h = callback;
        this.k = interfaceC0079Ap3;
    }
}
