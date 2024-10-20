package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.logo.LogoBridge;
import org.chromium.chrome.browser.logo.LogoView;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.image_fetcher.ImageFetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11037wI1 implements CI1 {
    public final Callback a;
    public final LogoView b;
    public final LogoBridge c;
    public ImageFetcher d;
    public String e;
    public String f;
    public boolean g = true;
    public boolean h;

    public C11037wI1(Callback callback, LogoView logoView, Profile profile) {
        this.b = logoView;
        this.c = new LogoBridge(profile);
        this.d = AbstractC0687Fh1.b(1, profile.g());
        this.a = callback;
    }

    public final void a() {
        this.h = true;
        LogoBridge logoBridge = this.c;
        N.MwFfD4qv(logoBridge.a, logoBridge);
        logoBridge.a = 0L;
        this.d.b();
        this.d = null;
    }
}
