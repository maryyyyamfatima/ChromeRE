package defpackage;

import android.os.Parcel;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NH extends AbstractBinderC7826mw {
    public final /* synthetic */ QH a;

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        QH qh = this.a;
        if (i == 1) {
            final String readString = parcel.readString();
            final String readString2 = parcel.readString();
            AbstractBinderC7826mw.g1(parcel);
            C8136nq1 c8136nq1 = qh.g;
            if (c8136nq1 != null && c8136nq1.k()) {
                final C8136nq1 c8136nq12 = qh.g;
                c8136nq12.getClass();
                C5531gF3 c5531gF3 = new C5531gF3();
                c5531gF3.a = new InterfaceC5565gM2() { // from class: Yp1
                    @Override // defpackage.InterfaceC5565gM2
                    public final void accept(Object obj, Object obj2) {
                        C6905kF3 c6905kF3 = (C6905kF3) obj2;
                        C8136nq1 c8136nq13 = C8136nq1.this;
                        c8136nq13.getClass();
                        C0002Aa1 c0002Aa1 = (C0002Aa1) ((InterfaceC0262Ca1) ((C9658sH) obj).m());
                        Parcel a = c0002Aa1.a();
                        a.writeString(readString);
                        a.writeString(readString2);
                        AbstractC11786yV.b(a, null);
                        c0002Aa1.M0(14, a);
                        synchronized (c8136nq13.s) {
                            if (c8136nq13.p != null) {
                                synchronized (c8136nq13.s) {
                                    C6905kF3 c6905kF32 = c8136nq13.p;
                                    if (c6905kF32 != null) {
                                        c6905kF32.a(AbstractC10800vd.a(new Status(2477, null)));
                                    }
                                    c8136nq13.p = null;
                                }
                            }
                            c8136nq13.p = c6905kF3;
                        }
                    }
                };
                c5531gF3.d = 8407;
                c8136nq12.b(1, c5531gF3.a()).a(new InterfaceC1702Nc2() { // from class: MH
                    @Override // defpackage.InterfaceC1702Nc2
                    public final void b(AF3 af3) {
                        QH.e(NH.this.a, "joinApplication", af3);
                    }
                });
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            final String readString3 = parcel.readString();
            final LaunchOptions launchOptions = (LaunchOptions) AbstractC11786yV.a(parcel, LaunchOptions.CREATOR);
            AbstractBinderC7826mw.g1(parcel);
            C8136nq1 c8136nq13 = qh.g;
            if (c8136nq13 != null && c8136nq13.k()) {
                final C8136nq1 c8136nq14 = qh.g;
                c8136nq14.getClass();
                C5531gF3 c5531gF32 = new C5531gF3();
                c5531gF32.a = new InterfaceC5565gM2() { // from class: cq1
                    @Override // defpackage.InterfaceC5565gM2
                    public final void accept(Object obj, Object obj2) {
                        C6905kF3 c6905kF3 = (C6905kF3) obj2;
                        C8136nq1 c8136nq15 = C8136nq1.this;
                        c8136nq15.getClass();
                        C0002Aa1 c0002Aa1 = (C0002Aa1) ((InterfaceC0262Ca1) ((C9658sH) obj).m());
                        Parcel a = c0002Aa1.a();
                        a.writeString(readString3);
                        AbstractC11786yV.b(a, launchOptions);
                        c0002Aa1.M0(13, a);
                        synchronized (c8136nq15.s) {
                            if (c8136nq15.p != null) {
                                synchronized (c8136nq15.s) {
                                    C6905kF3 c6905kF32 = c8136nq15.p;
                                    if (c6905kF32 != null) {
                                        c6905kF32.a(AbstractC10800vd.a(new Status(2477, null)));
                                    }
                                    c8136nq15.p = null;
                                }
                            }
                            c8136nq15.p = c6905kF3;
                        }
                    }
                };
                c5531gF32.d = 8406;
                c8136nq14.b(1, c5531gF32.a()).a(new InterfaceC1702Nc2() { // from class: LH
                    @Override // defpackage.InterfaceC1702Nc2
                    public final void b(AF3 af3) {
                        QH.e(NH.this.a, "launchApplication", af3);
                    }
                });
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(222980000);
                return true;
            }
            parcel.readInt();
            AbstractBinderC7826mw.g1(parcel);
            QH.d(qh);
            parcel2.writeNoException();
            return true;
        }
        final String readString4 = parcel.readString();
        AbstractBinderC7826mw.g1(parcel);
        C8136nq1 c8136nq15 = qh.g;
        if (c8136nq15 != null && c8136nq15.k()) {
            final C8136nq1 c8136nq16 = qh.g;
            c8136nq16.getClass();
            C5531gF3 c5531gF33 = new C5531gF3();
            c5531gF33.a = new InterfaceC5565gM2() { // from class: Tp1
                @Override // defpackage.InterfaceC5565gM2
                public final void accept(Object obj, Object obj2) {
                    C8136nq1 c8136nq17 = C8136nq1.this;
                    String str = readString4;
                    C6905kF3 c6905kF3 = (C6905kF3) obj2;
                    c8136nq17.getClass();
                    C0002Aa1 c0002Aa1 = (C0002Aa1) ((InterfaceC0262Ca1) ((C9658sH) obj).m());
                    Parcel a = c0002Aa1.a();
                    a.writeString(str);
                    c0002Aa1.M0(5, a);
                    synchronized (c8136nq17.t) {
                        if (c8136nq17.q != null) {
                            c6905kF3.a(AbstractC10800vd.a(new Status(2001, null)));
                        } else {
                            c8136nq17.q = c6905kF3;
                        }
                    }
                }
            };
            c5531gF33.d = 8409;
            c8136nq16.b(1, c5531gF33.a());
        }
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NH(QH qh) {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
        this.a = qh;
    }
}
