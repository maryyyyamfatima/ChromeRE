package defpackage;

import J.N;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fU2 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5261fU2 implements Runnable {
    public final /* synthetic */ C10069tU2 a;

    public /* synthetic */ RunnableC5261fU2(C10069tU2 c10069tU2) {
        this.a = c10069tU2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10069tU2 c10069tU2 = this.a;
        if (c10069tU2.a != null) {
            int Mz6Gbj2i = N.Mz6Gbj2i(Profile.d());
            EI2.h(Mz6Gbj2i, 8, "Settings.SafetyCheck.SafeBrowsingResult");
            PropertyModel propertyModel = c10069tU2.a;
            ND2 nd2 = AbstractC10412uU2.c;
            int i = 1;
            if (Mz6Gbj2i != 0) {
                if (Mz6Gbj2i != 1) {
                    if (Mz6Gbj2i != 2) {
                        i = 5;
                        if (Mz6Gbj2i != 3) {
                            if (Mz6Gbj2i != 5) {
                                if (Mz6Gbj2i == 6) {
                                    i = 3;
                                } else if (Mz6Gbj2i != 7) {
                                    i = 0;
                                }
                            }
                        }
                    } else {
                        i = 4;
                    }
                }
                i = 2;
            }
            propertyModel.m(nd2, i);
        }
    }
}
