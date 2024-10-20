package defpackage;

import java.util.Comparator;
import org.chromium.chrome.browser.content_creation.reactions.scene.ReactionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XV2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((ReactionLayout) obj).k.f0.e, ((ReactionLayout) obj2).k.f0.e);
    }
}
