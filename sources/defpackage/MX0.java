package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class MX0 extends QX0 implements InterfaceC7327lV1 {
    public C5563gM0 j = C5563gM0.d;

    public final void v(OX0 ox0) {
        if (ox0.a != ((QX0) l(PX0.GET_DEFAULT_INSTANCE))) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
