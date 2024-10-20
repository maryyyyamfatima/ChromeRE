package defpackage;

import J.N;
import java.util.Comparator;
import org.chromium.components.payments.PaymentApp;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: io2 */
/* loaded from: classes.dex */
public final class C6406io2 implements Comparator {
    public final InterfaceC7437lo2 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ?? r3;
        int i;
        PaymentApp paymentApp = (PaymentApp) obj;
        PaymentApp paymentApp2 = (PaymentApp) obj2;
        int i2 = (paymentApp.p() == 1 ? 1 : 0) - (paymentApp2.p() == 1 ? 1 : 0);
        if (i2 != 0) {
            return i2;
        }
        int compare = Integer.compare(paymentApp2.g, paymentApp.g);
        if (compare != 0) {
            return compare;
        }
        C7787mp2 c7787mp2 = ((C2287Rp2) this.a).n;
        if (c7787mp2 != null) {
            if (c7787mp2.e) {
                int i3 = (paymentApp2.u() ? 1 : 0) - (paymentApp.u() ? 1 : 0);
                if (i3 != 0) {
                    return i3;
                }
            }
            if (c7787mp2.b) {
                boolean s = paymentApp.s();
                if (paymentApp2.s()) {
                    i = 1;
                    r3 = s;
                } else {
                    i = 0;
                    r3 = s;
                }
            } else {
                r3 = 0;
                i = 0;
            }
            int i4 = r3;
            if (c7787mp2.c) {
                int i5 = r3;
                if (paymentApp.r()) {
                    i5 = r3 + 1;
                }
                i4 = i5;
                if (paymentApp2.r()) {
                    i++;
                    i4 = i5;
                }
            }
            int i6 = i4;
            if (c7787mp2.d) {
                int i7 = i4;
                if (paymentApp.t()) {
                    i7 = i4 + 1;
                }
                i6 = i7;
                if (paymentApp2.t()) {
                    i++;
                    i6 = i7;
                }
            }
            if (i != i6) {
                return i - i6 <= 0 ? -1 : 1;
            }
        }
        int i8 = (paymentApp2.j() ? 1 : 0) - (paymentApp.j() ? 1 : 0);
        if (i8 != 0) {
            return i8;
        }
        String str = paymentApp2.l;
        Q83 q83 = O83.a;
        C10218tu1 c10218tu1 = AbstractC6265iP.m;
        int f = q83.f(0, c10218tu1.b(str));
        int f2 = q83.f(0, c10218tu1.b(paymentApp.l));
        String str2 = paymentApp2.l;
        C10218tu1 c10218tu12 = AbstractC6265iP.n;
        return Double.compare(a(f, q83.h(c10218tu12.b(str2))), a(f2, q83.h(c10218tu12.b(paymentApp2.l))));
    }

    public C6406io2(InterfaceC7437lo2 interfaceC7437lo2) {
        this.a = interfaceC7437lo2;
    }

    public static double a(int i, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("AutofillEnableRankingFormula")) {
            return (-Math.log(((currentTimeMillis - j) / 86400000) + 2)) / Math.log(i + 2);
        }
        return Math.exp(((currentTimeMillis - j) / 86400000) / (N.M37SqSAy("AutofillEnableRankingFormula", "AutofillRankingFormulaUsageHalfLife", 20) != 0 ? r2 : 20)) * Math.log10(i + 1);
    }
}
