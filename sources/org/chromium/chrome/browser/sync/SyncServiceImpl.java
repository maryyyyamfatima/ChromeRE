package org.chromium.chrome.browser.sync;

import J.N;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC9076qb1;
import defpackage.InterfaceC1528Lt3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SyncServiceImpl extends AbstractC1658Mt3 {
    public static final int[] f = {5, 1, 3, 2, 38, 10};
    public int d;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final long c = N.Mq2O1L55(this);

    @Override // defpackage.AbstractC1658Mt3
    public final void a(InterfaceC1528Lt3 interfaceC1528Lt3) {
        Object obj = ThreadUtils.a;
        this.e.add(interfaceC1528Lt3);
    }

    @Override // defpackage.AbstractC1658Mt3
    public final void l(InterfaceC1528Lt3 interfaceC1528Lt3) {
        Object obj = ThreadUtils.a;
        this.e.remove(interfaceC1528Lt3);
    }

    public void syncStateChanged() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((InterfaceC1528Lt3) it.next()).B();
        }
    }

    @Override // defpackage.AbstractC1658Mt3
    public final boolean k() {
        if (!h()) {
            return false;
        }
        int[] MVqF80Hk = N.MVqF80Hk(this.c);
        HashSet hashSet = new HashSet();
        for (int i : MVqF80Hk) {
            hashSet.add(Integer.valueOf(i));
        }
        if (hashSet.contains(10)) {
            return f() == 1 || f() == 4;
        }
        return false;
    }

    public static void onGetAllNodesResult(Callback callback, String str) {
        try {
            callback.onResult(new JSONArray(str));
        } catch (JSONException unused) {
            callback.onResult(new JSONArray());
        }
    }

    @Override // defpackage.AbstractC1658Mt3
    public final boolean j() {
        return N.Ms9hWCjY(this.c);
    }

    @Override // defpackage.AbstractC1658Mt3
    public final boolean h() {
        return N.MDAo3Ozm(this.c);
    }

    @Override // defpackage.AbstractC1658Mt3
    public final void m(int i) {
        N.MDDo$0ot(this.c, i);
    }

    @Override // defpackage.AbstractC1658Mt3
    public final HashSet e() {
        int[] Me$_G_3F = N.Me$_G_3F(this.c);
        HashSet hashSet = new HashSet();
        for (int i : Me$_G_3F) {
            hashSet.add(Integer.valueOf(i));
        }
        return hashSet;
    }

    @Override // defpackage.AbstractC1658Mt3
    public final boolean g() {
        return N.MzPOLnaO(this.c);
    }

    @Override // defpackage.AbstractC1658Mt3
    public final boolean i() {
        return N.MljitpQi(this.c);
    }

    @Override // defpackage.AbstractC1658Mt3
    public final int f() {
        int MWsjrqlA = N.MWsjrqlA(this.c);
        if (MWsjrqlA < 0 || MWsjrqlA > 4) {
            throw new IllegalArgumentException();
        }
        return MWsjrqlA;
    }

    @Override // defpackage.AbstractC1658Mt3
    public final int d() {
        int M6Zr$x1d = N.M6Zr$x1d(this.c);
        if (M6Zr$x1d < 0 || M6Zr$x1d >= 14) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("No state for code: ", M6Zr$x1d));
        }
        return M6Zr$x1d;
    }

    @Override // defpackage.AbstractC1658Mt3
    public final CoreAccountInfo c() {
        return (CoreAccountInfo) N.MAPSa9re(this.c);
    }
}
