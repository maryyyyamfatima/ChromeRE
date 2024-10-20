package defpackage;

import android.view.View;
import org.chromium.chrome.browser.omnibox.g;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gG3 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5536gG3 implements View.OnClickListener {
    public final /* synthetic */ OJ0 a;
    public final /* synthetic */ C6566jG3 g;

    public ViewOnClickListenerC5536gG3(C6566jG3 c6566jG3, OJ0 oj0) {
        this.g = c6566jG3;
        this.a = oj0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OJ0 oj0 = this.a;
        if (oj0 != null) {
            oj0.a(14, true);
        }
        ((g) this.g.a).I().h(3);
        FI2.a("TasksSurface.FakeBox.VoiceSearch");
    }
}
