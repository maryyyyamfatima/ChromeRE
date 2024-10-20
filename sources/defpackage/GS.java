package defpackage;

import java.io.ByteArrayInputStream;
import org.chromium.chrome.browser.xsurface.ImageFetchClient$HttpResponseConsumer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GS implements ImageFetchClient$HttpResponseConsumer {
    public final /* synthetic */ InterfaceC3015Xf0 a;

    public GS(InterfaceC3015Xf0 interfaceC3015Xf0) {
        this.a = interfaceC3015Xf0;
    }

    @Override // org.chromium.chrome.browser.xsurface.ImageFetchClient$HttpResponseConsumer
    public final void a(C6236iJ0 c6236iJ0) {
        int i = c6236iJ0.a;
        InterfaceC3015Xf0 interfaceC3015Xf0 = this.a;
        if (i == 200) {
            interfaceC3015Xf0.f(new ByteArrayInputStream(c6236iJ0.b));
        } else {
            interfaceC3015Xf0.d(new Exception(String.format("Unable to load image via native, response status: %d", Integer.valueOf(i))));
        }
    }
}
