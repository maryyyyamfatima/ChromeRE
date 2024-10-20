package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class IA0 {
    public final InterfaceC7559m90 a;
    public ByteBuffer b;
    public final ArrayList c = new ArrayList();
    public int d;

    public IA0(InterfaceC7559m90 interfaceC7559m90, int i) {
        this.a = interfaceC7559m90;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i <= 0 ? 1024 : i);
        this.b = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        this.d = 0;
    }
}
