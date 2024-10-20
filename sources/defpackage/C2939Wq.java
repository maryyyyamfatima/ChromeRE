package defpackage;

import J.N;
import android.os.Handler;
import java.util.ArrayList;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2939Wq implements InterfaceC7093ko2 {
    public Handler a;

    @Override // defpackage.InterfaceC7093ko2
    public final void a(InterfaceC6749jo2 interfaceC6749jo2) {
        final C2809Vq c2809Vq = new C2809Vq(interfaceC6749jo2);
        if (this.a == null) {
            this.a = new Handler();
        }
        final C7781mo2 c7781mo2 = (C7781mo2) interfaceC6749jo2;
        this.a.post(new Runnable() { // from class: Uq
            @Override // java.lang.Runnable
            public final void run() {
                C2939Wq c2939Wq = C2939Wq.this;
                c2939Wq.getClass();
                C2809Vq c2809Vq2 = c2809Vq;
                InterfaceC6749jo2 interfaceC6749jo22 = c2809Vq2.a;
                boolean z = false;
                z = false;
                if (!((C2287Rp2) interfaceC6749jo22.e()).u && c2809Vq2.b) {
                    PersonalDataManager d = PersonalDataManager.d();
                    d.getClass();
                    Object obj = ThreadUtils.a;
                    long j = d.a;
                    String[] M00Q2SNr = N.M00Q2SNr(j, d, false);
                    ArrayList arrayList = new ArrayList(M00Q2SNr.length);
                    for (String str : M00Q2SNr) {
                        arrayList.add((PersonalDataManager.CreditCard) N.M3g2doJx(j, d, str));
                    }
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        C3069Xq a = c2809Vq2.a((PersonalDataManager.CreditCard) arrayList.get(i));
                        if (a != null) {
                            interfaceC6749jo22.g(a);
                        }
                    }
                    z = true;
                }
                InterfaceC6749jo2 interfaceC6749jo23 = c7781mo2;
                interfaceC6749jo23.b(z);
                interfaceC6749jo23.d(c2939Wq);
            }
        });
    }
}
