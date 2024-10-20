package defpackage;

import com.google.android.libraries.elements.interfaces.ResourceEntry;
import com.google.android.libraries.elements.interfaces.ResourceMetadata;
import com.google.android.libraries.elements.interfaces.ResourceType;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kP2 */
/* loaded from: classes.dex */
public final class C6954kP2 extends AbstractC4734dw1 implements InterfaceC7670mV0 {
    public static final C6954kP2 g = new C6954kP2();

    public C6954kP2() {
        super(1);
    }

    @Override // defpackage.InterfaceC7670mV0
    public final Object b(Object obj) {
        C3370Zy0 c3370Zy0 = (C3370Zy0) obj;
        ResourceMetadata resourceMetadata = new ResourceMetadata(c3370Zy0.k, ResourceType.EML_TEMPLATE, (c3370Zy0.j & 4) != 0 ? Long.valueOf(c3370Zy0.n) : null, new ArrayList(c3370Zy0.m), null);
        C2479Tc c2479Tc = c3370Zy0.l;
        if (c2479Tc == null) {
            c2479Tc = C2479Tc.k;
        }
        return new ResourceEntry(resourceMetadata, c2479Tc.j.p());
    }
}
