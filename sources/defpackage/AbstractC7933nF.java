package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nF */
/* loaded from: classes.dex */
public abstract class AbstractC7933nF {
    public static C7589mF a(InterfaceC6901kF interfaceC6901kF) {
        C6215iF c6215iF = new C6215iF();
        C7589mF c7589mF = new C7589mF(c6215iF);
        c6215iF.b = c7589mF;
        c6215iF.a = interfaceC6901kF.getClass();
        try {
            Object a = interfaceC6901kF.a(c6215iF);
            if (a != null) {
                c6215iF.a = a;
            }
        } catch (Exception e) {
            C7245lF c7245lF = c7589mF.g;
            c7245lF.getClass();
            if (AbstractC11278x0.j.b(c7245lF, null, new C9563s0(e))) {
                AbstractC11278x0.b(c7245lF);
            }
        }
        return c7589mF;
    }
}
