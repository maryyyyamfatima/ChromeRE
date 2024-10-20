package org.chromium.chrome.browser.profiles;

import J.N;
import org.chromium.components.embedder_support.simple_factory_key.SimpleFactoryKeyHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ProfileKey implements SimpleFactoryKeyHandle {
    public final boolean a;
    public long b;

    public ProfileKey(long j) {
        this.b = j;
        this.a = N.MdejbNQu(j);
    }

    @Override // org.chromium.components.embedder_support.simple_factory_key.SimpleFactoryKeyHandle
    public final long getNativeSimpleFactoryKeyPointer() {
        return N.M1kMd8V5(this.b);
    }

    public static ProfileKey create(long j) {
        return new ProfileKey(j);
    }

    public final void onNativeDestroyed() {
        this.b = 0L;
    }

    public final long getNativePointer() {
        return this.b;
    }

    public static ProfileKey a() {
        return (ProfileKey) N.MZXDYv9T();
    }
}
