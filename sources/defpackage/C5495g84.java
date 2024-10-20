package defpackage;

import J.N;
import android.os.Parcel;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g84 */
/* loaded from: classes.dex */
public final class C5495g84 extends AbstractC0185Bl {
    public final /* synthetic */ C5839h84 h;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        if (this.h.c.a(new U44())) {
            C4374ct2 c4374ct2 = new C4374ct2(V60.a);
            C5531gF3 c5531gF3 = new C5531gF3();
            c5531gF3.a = new InterfaceC5565gM2() { // from class: Ys2
                public final /* synthetic */ String a = "LOCAL.com.google.android.agsa.QSB";

                @Override // defpackage.InterfaceC5565gM2
                public final void accept(Object obj, Object obj2) {
                    BinderC4031bt2 binderC4031bt2 = new BinderC4031bt2((C6905kF3) obj2);
                    C1452Le1 c1452Le1 = (C1452Le1) ((InterfaceC1711Ne1) ((C5061et2) obj).m());
                    Parcel a = c1452Le1.a();
                    AbstractC11786yV.c(a, binderC4031bt2);
                    a.writeString(this.a);
                    a.writeString(null);
                    c1452Le1.h(6, a);
                }
            };
            try {
                ExperimentTokens experimentTokens = (ExperimentTokens) UF3.b(c4374ct2.b(0, c5531gF3.a()), 5L, TimeUnit.SECONDS);
                if (experimentTokens != null) {
                    return experimentTokens.l;
                }
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                AbstractC4851eH1.a("VariationsSessionInt", "Timeout while querying Phenotype experiments", new Object[0]);
            }
        }
        return null;
    }

    public C5495g84(C5839h84 c5839h84) {
        this.h = c5839h84;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        int[] iArr = (int[]) obj;
        if (iArr != null) {
            C5839h84 c5839h84 = this.h;
            if (Arrays.equals(iArr, c5839h84.f)) {
                return;
            }
            c5839h84.f = iArr;
            Object obj2 = ThreadUtils.a;
            if (c5839h84.d) {
                N.MwmPuE$v("GsaExperiments", iArr, true);
            }
        }
    }
}
