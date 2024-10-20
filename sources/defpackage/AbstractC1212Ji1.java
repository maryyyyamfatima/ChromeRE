package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ji1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1212Ji1 extends AbstractC8164nv implements Serializable {
    final transient AbstractC0952Hi1 map;
    final transient int size;

    public AbstractC1212Ji1(TL2 tl2, int i) {
        this.map = tl2;
        this.size = i;
    }

    @Override // defpackage.AbstractC5098f0, defpackage.InterfaceC8195o02
    public final Map a() {
        return this.map;
    }
}
