package defpackage;

import android.R;
import android.view.ViewGroup;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.components.browser_ui.widget.text.TemplatePreservingTextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vS3 */
/* loaded from: classes.dex */
public final class C10746vS3 extends C1978Pf3 {
    public final InterfaceC0079Ap3 q;

    public C10746vS3(ChromeActivity chromeActivity, ViewOnClickListenerC10403uS3 viewOnClickListenerC10403uS3, C12188zf3 c12188zf3, C10285u6 c10285u6, InterfaceC7697ma2 interfaceC7697ma2) {
        super(chromeActivity, viewOnClickListenerC10403uS3, c12188zf3, (ViewGroup) chromeActivity.findViewById(R.id.content), c10285u6);
        this.q = interfaceC7697ma2;
    }

    @Override // defpackage.C1978Pf3
    public final int d() {
        return -this.b.getHeight();
    }

    @Override // defpackage.C1978Pf3
    public final int c() {
        int height = this.j.getHeight() - this.c.getHeight();
        int i = 0;
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.q;
        if (interfaceC0079Ap3 != null && interfaceC0079Ap3.i() && ((CC) interfaceC0079Ap3.get()).t != 0) {
            i = ((CC) interfaceC0079Ap3.get()).m;
        }
        return height - i;
    }

    @Override // defpackage.C1978Pf3
    public final void a() {
        StringBuilder sb = new StringBuilder();
        TemplatePreservingTextView templatePreservingTextView = this.d;
        sb.append((Object) templatePreservingTextView.getContentDescription());
        sb.append(" ");
        sb.append(this.b.getResources().getString(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140b37));
        templatePreservingTextView.announceForAccessibility(sb.toString());
    }
}
