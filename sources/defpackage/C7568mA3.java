package defpackage;

import J.N;
import android.util.Log;
import java.io.File;
import java.util.ArrayDeque;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mA3 */
/* loaded from: classes.dex */
public final class C7568mA3 extends AbstractC0185Bl {
    public final Tab h;
    public final int i;
    public IA3 j;
    public final boolean k;
    public boolean l;
    public final /* synthetic */ C9284rA3 m;

    @Override // defpackage.AbstractC0185Bl
    public final void l() {
        if (this.m.m || h()) {
            return;
        }
        this.j = PA3.a(this.h);
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        C9284rA3 c9284rA3 = this.m;
        if (c9284rA3.m || h()) {
            return;
        }
        if (this.l) {
            Tab tab = this.h;
            int i = 0;
            if (!tab.isDestroyed()) {
                JA3.a(tab).b(false);
            }
            tab.E(C9284rA3.i() || C9284rA3.h());
            if (C9284rA3.i() || C9284rA3.h()) {
                while (true) {
                    int i2 = 5;
                    if (AbstractC8293oI0.a()) {
                        C7928nE c7928nE = UN.a;
                        i2 = N.M37SqSAy("CriticalPersistedTabData", "migrate_to_critical_persisted_tab_data_batch_size", 5);
                    }
                    if (i >= i2) {
                        break;
                    }
                    ArrayDeque arrayDeque = c9284rA3.g;
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    Tab tab2 = (Tab) arrayDeque.pollFirst();
                    if (tab2 != null && !tab2.isDestroyed()) {
                        tab2.E(true);
                    }
                    i++;
                }
            }
        }
        c9284rA3.k = null;
        c9284rA3.r();
    }

    public C7568mA3(C9284rA3 c9284rA3, Tab tab) {
        this.m = c9284rA3;
        this.h = tab;
        this.i = tab.getId();
        this.k = tab.isIncognito();
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        boolean z;
        int i = this.i;
        boolean z2 = this.k;
        IA3 ia3 = this.j;
        C9284rA3 c9284rA3 = this.m;
        c9284rA3.getClass();
        if (ia3 != null) {
            try {
                QA3.e(new File(c9284rA3.g(), QA3.a(i, z2)), ia3, z2);
                z = true;
            } catch (OutOfMemoryError unused) {
                Log.e("tabmodel", "Out of memory error while attempting to save tab state.  Erasing.");
                c9284rA3.f(i, z2);
            }
            this.l = z;
            return null;
        }
        z = false;
        this.l = z;
        return null;
    }
}
