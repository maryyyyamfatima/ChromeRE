package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.chrome.browser.crash.MinidumpUploadServiceImpl;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10083tX1 implements G22 {
    public static C10083tX1 g;
    public final InterfaceC1301Ka0 a;

    public C10083tX1(InterfaceC1301Ka0 interfaceC1301Ka0) {
        this.a = interfaceC1301Ka0;
        NetworkChangeNotifier.a(this);
    }

    @Override // defpackage.G22
    public final void b(int i) {
        if (i != 6 && this.a.d()) {
            AtomicBoolean atomicBoolean = MinidumpUploadServiceImpl.b;
            File[] e = new C0781Ga0(V60.a.getCacheDir()).e();
            AbstractC4851eH1.d("MinidmpUploadService", "Attempting to upload accumulated crash dumps.", new Object[0]);
            for (File file : e) {
                MinidumpUploadServiceImpl.g(file);
            }
            NetworkChangeNotifier.g(this);
            g = null;
        }
    }
}
