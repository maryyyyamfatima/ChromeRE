package defpackage;

import android.app.Activity;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vr3 */
/* loaded from: classes.dex */
public final class C2818Vr3 extends ClickableSpan {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ String g;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C5364fm3 c5364fm3 = new C5364fm3();
        try {
            AbstractC8941qA2.a(this.a, this.g);
        } catch (KC e) {
            Log.e("SurveyUtils", "No app found to open URL: " + e.a);
        }
        Activity activity = this.a;
        String str = this.g;
        if (OP0.c(C10747vT.a(OP0.b))) {
            C4931eX1 a = C4931eX1.a();
            C3771b74 c3771b74 = (C3771b74) C4801e74.l.j();
            if (c3771b74.h) {
                c3771b74.l();
                c3771b74.h = false;
            }
            C4801e74 c4801e74 = (C4801e74) c3771b74.g;
            c4801e74.getClass();
            c4801e74.j = AbstractC4114c74.a(1);
            if (c3771b74.h) {
                c3771b74.l();
                c3771b74.h = false;
            }
            C4801e74 c4801e742 = (C4801e74) c3771b74.g;
            c4801e742.getClass();
            c4801e742.k = AbstractC4458d74.a(3);
            a.e((C4801e74) c3771b74.j(), c5364fm3.b(), c5364fm3.a(), activity, str);
        }
    }

    public C2818Vr3(String str, Activity activity) {
        this.a = activity;
        this.g = str;
    }
}
