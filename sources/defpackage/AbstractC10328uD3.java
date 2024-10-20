package defpackage;

import android.graphics.Rect;
import org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uD3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10328uD3 extends WebContentsDelegateAndroid {
    public abstract boolean addNewContents(WebContents webContents, WebContents webContents2, int i, Rect rect, boolean z);

    public boolean canShowAppBanners() {
        return !(this instanceof C7692mZ2);
    }

    public String getManifestScope() {
        return null;
    }

    public boolean isCustomTab() {
        return false;
    }

    public boolean isForceDarkWebContentEnabled() {
        return false;
    }

    public boolean isInstalledWebappDelegateGeolocation() {
        return false;
    }

    public boolean isNightModeEnabled() {
        return false;
    }

    public boolean isPictureInPictureEnabled() {
        return false;
    }

    public abstract void setOverlayMode(boolean z);

    public boolean shouldEnableEmbeddedMediaExperience() {
        return false;
    }

    public abstract boolean shouldResumeRequestsForCreatedWindow();
}
