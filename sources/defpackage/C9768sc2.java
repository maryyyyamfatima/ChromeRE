package defpackage;

import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sc2 */
/* loaded from: classes.dex */
public final class C9768sc2 extends C4617dc3 {
    public int k;
    public AbstractC12077zK2 l;

    @Override // defpackage.C4617dc3, defpackage.AbstractC8305oK2
    public final /* bridge */ /* synthetic */ void C(d dVar, int i) {
        C((C4273cc3) dVar, i);
    }

    @Override // defpackage.C4617dc3, defpackage.AbstractC8305oK2
    public final /* bridge */ /* synthetic */ d E(int i, RecyclerView recyclerView) {
        return E(i, recyclerView);
    }

    public C9768sc2(C7616mK1 c7616mK1) {
        super(c7616mK1);
        this.k = -1;
    }

    public final boolean R(int i) {
        if (this.l == null) {
            return false;
        }
        if (i != -1 && (i < 0 || i >= q())) {
            return false;
        }
        View r = this.l.r(this.k);
        if (r != null) {
            r.setSelected(false);
        }
        this.k = i;
        this.l.t0(i);
        View r2 = this.l.r(i);
        if (r2 != null) {
            r2.setSelected(true);
        }
        return true;
    }

    @Override // defpackage.C4617dc3
    public final View M(int i, RecyclerView recyclerView) {
        TraceEvent i2 = TraceEvent.i("OmniboxSuggestionsList.CreateView", "type:" + i);
        try {
            AN3 an3 = new AN3("Android.Omnibox.SuggestionView.CreateTime2", 2);
            an3.h = SystemClock.currentThreadTimeMillis();
            try {
                View M = super.M(i, recyclerView);
                an3.close();
                if (i2 != null) {
                    i2.close();
                }
                return M;
            } catch (Throwable th) {
                try {
                    an3.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused2) {
                }
            }
            throw th2;
        }
    }

    @Override // defpackage.C4617dc3, defpackage.AbstractC8305oK2
    /* renamed from: P */
    public final void I(C4273cc3 c4273cc3) {
        c4273cc3.v(null);
        View view = c4273cc3.a;
        if (view == null) {
            return;
        }
        view.setSelected(false);
    }

    @Override // defpackage.AbstractC8305oK2
    public final void A(RecyclerView recyclerView) {
        this.l = recyclerView.s;
        this.k = -1;
    }
}
