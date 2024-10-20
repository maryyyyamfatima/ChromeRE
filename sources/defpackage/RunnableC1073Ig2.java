package defpackage;

import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ig2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1073Ig2 implements Runnable {
    public final /* synthetic */ C0813Gg2 a;

    public /* synthetic */ RunnableC1073Ig2(C0813Gg2 c0813Gg2) {
        this.a = c0813Gg2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0813Gg2 c0813Gg2 = this.a;
        boolean z = c0813Gg2.a.getVisibility() != 0;
        c0813Gg2.a.setVisibility(z ? 0 : 8);
        c0813Gg2.g.setVisibility(z ? 8 : 0);
        c0813Gg2.announceForAccessibility(c0813Gg2.getResources().getString(z ? R.string.f79780_resource_name_obfuscated_res_0x7f140774 : R.string.f79790_resource_name_obfuscated_res_0x7f140775));
    }
}
