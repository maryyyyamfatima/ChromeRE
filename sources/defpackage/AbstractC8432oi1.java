package defpackage;

import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oi1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8432oi1 {
    public static final C8088ni1 a = new Dl4() { // from class: ni1
        @Override // defpackage.Dl4
        public final Object a(WebContentsImpl webContentsImpl) {
            return new ImeAdapterImpl(webContentsImpl);
        }
    };
}
