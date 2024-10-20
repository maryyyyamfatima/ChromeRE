package defpackage;

import android.app.Activity;
import android.view.View;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.components.autofill_assistant.AssistantDependencies;
import org.chromium.components.autofill_assistant.AssistantStaticDependencies;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uk */
/* loaded from: classes.dex */
public final class C10499uk extends C0440Dk implements AssistantDependencies {
    public ChromeActivity a;
    public C10285u6 b;
    public View c;

    @Override // org.chromium.components.autofill_assistant.AssistantDependencies
    public final /* synthetic */ AssistantStaticDependencies getStaticDependencies() {
        return AbstractC10156tk.a(this);
    }

    public C10499uk(Activity activity) {
        if (activity != this.a && (activity instanceof ChromeActivity)) {
            ChromeActivity chromeActivity = (ChromeActivity) activity;
            C8385oa2 c8385oa2 = chromeActivity.r0;
            this.a = chromeActivity;
            C10285u6 c10285u6 = chromeActivity.H;
            this.b = c10285u6;
            UB.a(c10285u6);
            chromeActivity.k1();
            this.b.r();
            this.b.getClass();
            this.c = (View) c8385oa2.g;
            chromeActivity.z();
        }
    }
}
