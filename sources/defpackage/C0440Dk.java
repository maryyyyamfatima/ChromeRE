package defpackage;

import J.N;
import android.app.Activity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.autofill_assistant.AssistantAccessTokenUtil;
import org.chromium.components.autofill_assistant.AssistantInfoPageUtil;
import org.chromium.components.autofill_assistant.AssistantStaticDependencies;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.components.image_fetcher.ImageFetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dk */
/* loaded from: classes.dex */
public class C0440Dk implements AssistantStaticDependencies {
    @Override // org.chromium.components.autofill_assistant.AssistantStaticDependencies
    public final /* synthetic */ boolean isAccessibilityEnabled() {
        return AbstractC0310Ck.a(this);
    }

    @Override // org.chromium.components.autofill_assistant.AssistantStaticDependencies
    public final long createNative() {
        return N.MjsKP5B8(new C0440Dk());
    }

    @Override // org.chromium.components.autofill_assistant.AssistantStaticDependencies
    public final C10499uk b(Activity activity) {
        return new C10499uk(activity);
    }

    @Override // org.chromium.components.autofill_assistant.AssistantStaticDependencies
    public final C10021tL a() {
        return C10021tL.f();
    }

    @Override // org.chromium.components.autofill_assistant.AssistantStaticDependencies
    public final AssistantInfoPageUtil createInfoPageUtil() {
        return new C11528xk();
    }

    @Override // org.chromium.components.autofill_assistant.AssistantStaticDependencies
    public final AssistantAccessTokenUtil createAccessTokenUtil() {
        return new C9470rk();
    }

    @Override // org.chromium.components.autofill_assistant.AssistantStaticDependencies
    public final ImageFetcher createImageFetcher() {
        return AbstractC0687Fh1.b(1, Profile.d().g());
    }

    @Override // org.chromium.components.autofill_assistant.AssistantStaticDependencies
    public final LargeIconBridge createIconBridge() {
        return new LargeIconBridge(Profile.d());
    }
}
