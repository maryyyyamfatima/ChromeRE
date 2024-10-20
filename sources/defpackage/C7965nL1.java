package defpackage;

import java.nio.charset.Charset;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7965nL1 {
    public static final C7277lL1 b = new C7277lL1();
    public final InterfaceC6639jV1 a;

    public C7965nL1() {
        InterfaceC6639jV1 interfaceC6639jV1;
        InterfaceC6639jV1[] interfaceC6639jV1Arr = new InterfaceC6639jV1[2];
        interfaceC6639jV1Arr[0] = IX0.a;
        try {
            interfaceC6639jV1 = (InterfaceC6639jV1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC6639jV1 = b;
        }
        interfaceC6639jV1Arr[1] = interfaceC6639jV1;
        C7621mL1 c7621mL1 = new C7621mL1(interfaceC6639jV1Arr);
        Charset charset = AbstractC1507Lp1.a;
        this.a = c7621mL1;
    }
}
