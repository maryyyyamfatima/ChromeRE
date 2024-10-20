package defpackage;

import J.N;
import android.content.Intent;
import android.os.Parcel;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.chromium.components.webauthn.Fido2Api$AttestationObjectParts;
import org.chromium.components.webauthn.WebAuthnCredentialDetails;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class IL0 {
    public static void d(JE2 je2, Parcel parcel) {
        boolean z;
        int h = h(20293, parcel);
        int h2 = h(2, parcel);
        int h3 = h(20293, parcel);
        int h4 = h(2, parcel);
        parcel.writeString(je2.b.b);
        i(h4, parcel);
        int h5 = h(3, parcel);
        parcel.writeString(je2.b.c);
        i(h5, parcel);
        int h6 = h(4, parcel);
        U24 u24 = je2.b.d;
        parcel.writeString(u24 != null ? u24.b : null);
        i(h6, parcel);
        i(h3, parcel);
        i(h2, parcel);
        int h7 = h(3, parcel);
        int h8 = h(20293, parcel);
        int h9 = h(2, parcel);
        parcel.writeByteArray(je2.c.b);
        i(h9, parcel);
        int h10 = h(3, parcel);
        parcel.writeString(je2.c.c);
        i(h10, parcel);
        int h11 = h(4, parcel);
        U24 u242 = je2.c.d;
        parcel.writeString(u242 != null ? u242.b : null);
        i(h11, parcel);
        int h12 = h(5, parcel);
        parcel.writeString(je2.c.e);
        i(h12, parcel);
        i(h8, parcel);
        i(h7, parcel);
        int h13 = h(4, parcel);
        parcel.writeByteArray(je2.d);
        i(h13, parcel);
        int h14 = h(5, parcel);
        LE2[] le2Arr = je2.e;
        int length = le2Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            LE2 le2 = le2Arr[i];
            if (le2.c == -7 && le2.b == 0) {
                z = true;
                break;
            }
            i++;
        }
        if (!z && je2.e.length != 0) {
            throw new NoSuchAlgorithmException();
        }
        if (!z) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int dataPosition = parcel.dataPosition();
            parcel.writeInt(-572662307);
            int h15 = h(20293, parcel);
            int h16 = h(2, parcel);
            parcel.writeString("public-key");
            i(h16, parcel);
            int h17 = h(3, parcel);
            parcel.writeInt(-7);
            i(h17, parcel);
            i(h15, parcel);
            i(dataPosition, parcel);
        }
        i(h14, parcel);
        if (je2.f != null) {
            int h18 = h(6, parcel);
            parcel.writeDouble(je2.f != null ? Math.max(10.0d, Math.min(600.0d, TimeUnit.MICROSECONDS.toSeconds(r6.b))) : 600.0d);
            i(h18, parcel);
        }
        KE2[] ke2Arr = je2.g;
        if (ke2Arr != null && ke2Arr.length != 0) {
            int h19 = h(7, parcel);
            b(je2.g, parcel);
            i(h19, parcel);
        }
        if (je2.h != null) {
            int h20 = h(8, parcel);
            int h21 = h(20293, parcel);
            int i2 = je2.h.b;
            String str = i2 != 1 ? i2 != 2 ? null : "cross-platform" : "platform";
            if (str != null) {
                int h22 = h(2, parcel);
                parcel.writeString(str);
                i(h22, parcel);
            }
            int h23 = h(3, parcel);
            parcel.writeInt(je2.h.c == 2 ? 1 : 0);
            i(h23, parcel);
            int h24 = h(4, parcel);
            int i3 = je2.h.d;
            parcel.writeString(i3 != 0 ? i3 != 2 ? "preferred" : "discouraged" : "required");
            i(h24, parcel);
            int h25 = h(5, parcel);
            int i4 = je2.h.c;
            parcel.writeString(i4 != 1 ? i4 != 2 ? "discouraged" : "required" : "preferred");
            i(h25, parcel);
            i(h21, parcel);
            i(h20, parcel);
        }
        int h26 = h(11, parcel);
        int i5 = je2.i;
        parcel.writeString(i5 != 1 ? (i5 == 2 || i5 == 3) ? "direct" : "none" : "indirect");
        i(h26, parcel);
        i(h, parcel);
    }

    public static void c(ME2 me2, Parcel parcel) {
        int h = h(20293, parcel);
        int h2 = h(2, parcel);
        parcel.writeByteArray(me2.c);
        i(h2, parcel);
        if (me2.d != null) {
            int h3 = h(3, parcel);
            parcel.writeDouble(me2.d != null ? Math.max(10.0d, Math.min(600.0d, TimeUnit.MICROSECONDS.toSeconds(r4.b))) : 600.0d);
            i(h3, parcel);
        }
        int h4 = h(4, parcel);
        parcel.writeString(me2.e);
        i(h4, parcel);
        if (me2.f != null) {
            int h5 = h(5, parcel);
            b(me2.f, parcel);
            i(h5, parcel);
        }
        int h6 = h(8, parcel);
        int i = me2.g;
        parcel.writeString(i != 0 ? i != 2 ? "preferred" : "discouraged" : "required");
        i(h6, parcel);
        int h7 = h(9, parcel);
        int h8 = h(20293, parcel);
        if (me2.h != null) {
            int h9 = h(2, parcel);
            int h10 = h(20293, parcel);
            int h11 = h(2, parcel);
            parcel.writeString(me2.h);
            i(h11, parcel);
            i(h10, parcel);
            i(h9, parcel);
        }
        if (me2.j) {
            int h12 = h(4, parcel);
            int h13 = h(20293, parcel);
            int h14 = h(1, parcel);
            parcel.writeInt(1);
            i(h14, parcel);
            i(h13, parcel);
            i(h12, parcel);
        }
        i(h8, parcel);
        i(h7, parcel);
        i(h, parcel);
    }

    public static void b(KE2[] ke2Arr, Parcel parcel) {
        parcel.writeInt(ke2Arr.length);
        for (KE2 ke2 : ke2Arr) {
            int dataPosition = parcel.dataPosition();
            parcel.writeInt(-572662307);
            int h = h(20293, parcel);
            int h2 = h(2, parcel);
            int i = ke2.b;
            parcel.writeString("public-key");
            i(h2, parcel);
            int h3 = h(3, parcel);
            parcel.writeByteArray(ke2.c);
            i(h3, parcel);
            int h4 = h(4, parcel);
            parcel.writeInt(ke2.d.length);
            int[] iArr = ke2.d;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = iArr[i2];
                int dataPosition2 = parcel.dataPosition();
                parcel.writeInt(-572662307);
                parcel.writeString(i3 != 1 ? i3 != 2 ? i3 != 4 ? "usb" : "internal" : "ble" : "nfc");
                i(dataPosition2, parcel);
            }
            i(h4, parcel);
            i(h, parcel);
            i(dataPosition, parcel);
        }
    }

    public static int h(int i, Parcel parcel) {
        parcel.writeInt(i | (-65536));
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(-572662307);
        return dataPosition;
    }

    public static void i(int i, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i);
        parcel.writeInt((dataPosition - i) - 4);
        parcel.setDataPosition(dataPosition);
    }

    public static Pair g(Parcel parcel) {
        int readInt = parcel.readInt();
        int i = readInt & 65535;
        int i2 = (readInt >> 16) & 65535;
        if (i2 == 65535) {
            i2 = parcel.readInt();
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static Object f(Intent intent) {
        ArrayList arrayList;
        byte[] byteArrayExtra = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
        int i = 0;
        if (byteArrayExtra == null) {
            AbstractC4851eH1.a("Fido2Api", "FIDO2 PendingIntent missing response", new Object[0]);
            throw new IllegalArgumentException();
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
        obtain.setDataPosition(0);
        Pair g = g(obtain);
        int i2 = 20293;
        if (((Integer) g.first).intValue() != 20293) {
            throw new IllegalArgumentException();
        }
        int a = a(((Integer) g.second).intValue(), obtain);
        CY0 cy0 = null;
        HL0 hl0 = null;
        while (obtain.dataPosition() < a) {
            Pair g2 = g(obtain);
            int intValue = ((Integer) g2.first).intValue();
            if (intValue == 4) {
                Pair g3 = g(obtain);
                if (((Integer) g3.first).intValue() != 20293) {
                    throw new IllegalArgumentException();
                }
                int a2 = a(((Integer) g3.second).intValue(), obtain);
                byte[] bArr = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                while (obtain.dataPosition() < a2) {
                    Pair g4 = g(obtain);
                    int intValue2 = ((Integer) g4.first).intValue();
                    if (intValue2 == 2) {
                        bArr2 = obtain.createByteArray();
                    } else if (intValue2 == 3) {
                        bArr = obtain.createByteArray();
                    } else if (intValue2 == 4) {
                        bArr3 = obtain.createByteArray();
                    } else {
                        obtain.setDataPosition(a(((Integer) g4.second).intValue(), obtain));
                    }
                }
                if (bArr2 != null && bArr != null && bArr3 != null) {
                    FK1 fk1 = new FK1(0);
                    C10772vY c10772vY = new C10772vY(0);
                    fk1.d = bArr3;
                    Fido2Api$AttestationObjectParts fido2Api$AttestationObjectParts = new Fido2Api$AttestationObjectParts();
                    if (!N.MhXU5dNj(bArr3, fido2Api$AttestationObjectParts)) {
                        throw new IllegalArgumentException();
                    }
                    fk1.m = fido2Api$AttestationObjectParts.c;
                    c10772vY.e = fido2Api$AttestationObjectParts.a;
                    fk1.l = fido2Api$AttestationObjectParts.b;
                    fk1.e = new int[0];
                    c10772vY.b = Base64.encodeToString(bArr2, 11);
                    c10772vY.c = bArr2;
                    c10772vY.d = bArr;
                    fk1.b = c10772vY;
                    return fk1;
                }
                throw new IllegalArgumentException();
            }
            if (intValue == 5) {
                Pair g5 = g(obtain);
                if (((Integer) g5.first).intValue() != 20293) {
                    throw new IllegalArgumentException();
                }
                int a3 = a(((Integer) g5.second).intValue(), obtain);
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                while (obtain.dataPosition() < a3) {
                    Pair g6 = g(obtain);
                    int intValue3 = ((Integer) g6.first).intValue();
                    if (intValue3 == 2) {
                        bArr4 = obtain.createByteArray();
                    } else if (intValue3 == 3) {
                        bArr5 = obtain.createByteArray();
                    } else if (intValue3 == 4) {
                        bArr6 = obtain.createByteArray();
                    } else if (intValue3 == 5) {
                        bArr7 = obtain.createByteArray();
                    } else if (intValue3 == 6) {
                        bArr8 = obtain.createByteArray();
                    } else {
                        obtain.setDataPosition(a(((Integer) g6.second).intValue(), obtain));
                    }
                }
                if (bArr4 != null && bArr5 != null && bArr6 != null && bArr7 != null) {
                    C10772vY c10772vY2 = new C10772vY(0);
                    c10772vY2.e = bArr6;
                    c10772vY2.b = Base64.encodeToString(bArr4, 11);
                    c10772vY2.c = bArr4;
                    c10772vY2.d = bArr5;
                    CY0 cy02 = new CY0(0);
                    cy02.b = c10772vY2;
                    cy02.d = bArr7;
                    cy02.e = bArr8;
                    cy0 = cy02;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                if (intValue == 6) {
                    Pair g7 = g(obtain);
                    if (((Integer) g7.first).intValue() != 20293) {
                        throw new IllegalArgumentException();
                    }
                    int a4 = a(((Integer) g7.second).intValue(), obtain);
                    String str = null;
                    Integer num = null;
                    while (obtain.dataPosition() < a4) {
                        Pair g8 = g(obtain);
                        int intValue4 = ((Integer) g8.first).intValue();
                        if (intValue4 == 2) {
                            num = Integer.valueOf(obtain.readInt());
                        } else if (intValue4 == 3) {
                            str = obtain.readString();
                        } else {
                            obtain.setDataPosition(a(((Integer) g8.second).intValue(), obtain));
                        }
                    }
                    if (num == null) {
                        throw new IllegalArgumentException();
                    }
                    return new Pair(num, str);
                }
                if (intValue != 7) {
                    obtain.setDataPosition(a(((Integer) g2.second).intValue(), obtain));
                } else {
                    Pair g9 = g(obtain);
                    if (((Integer) g9.first).intValue() != i2) {
                        throw new IllegalArgumentException();
                    }
                    int a5 = a(((Integer) g9.second).intValue(), obtain);
                    HL0 hl02 = new HL0();
                    while (obtain.dataPosition() < a5) {
                        Pair g10 = g(obtain);
                        if (((Integer) g10.first).intValue() != 1) {
                            obtain.setDataPosition(a(((Integer) g10.second).intValue(), obtain));
                        } else {
                            Pair g11 = g(obtain);
                            if (((Integer) g11.first).intValue() != i2) {
                                throw new IllegalArgumentException();
                            }
                            int a6 = a(((Integer) g11.second).intValue(), obtain);
                            ArrayList arrayList2 = new ArrayList();
                            while (obtain.dataPosition() < a6) {
                                Pair g12 = g(obtain);
                                if (((Integer) g12.first).intValue() == 1) {
                                    int readInt = obtain.readInt();
                                    int i3 = i;
                                    while (i3 < readInt) {
                                        obtain.readInt();
                                        Pair g13 = g(obtain);
                                        if (((Integer) g13.first).intValue() != i2) {
                                            throw new IllegalArgumentException();
                                        }
                                        int a7 = a(((Integer) g13.second).intValue(), obtain);
                                        D74 d74 = new D74(i);
                                        while (obtain.dataPosition() < a7) {
                                            Pair g14 = g(obtain);
                                            int intValue5 = ((Integer) g14.first).intValue();
                                            if (intValue5 == 1) {
                                                d74.b = obtain.readInt();
                                            } else if (intValue5 == 2) {
                                                d74.c = (short) obtain.readInt();
                                            } else if (intValue5 == 3) {
                                                d74.d = (short) obtain.readInt();
                                            } else {
                                                obtain.setDataPosition(a(((Integer) g14.second).intValue(), obtain));
                                            }
                                        }
                                        arrayList2.add(d74);
                                        i3++;
                                        i = 0;
                                        i2 = 20293;
                                    }
                                } else {
                                    obtain.setDataPosition(a(((Integer) g12.second).intValue(), obtain));
                                }
                            }
                            hl02.a = arrayList2;
                            i = 0;
                            i2 = 20293;
                        }
                    }
                    hl0 = hl02;
                }
            }
            i = 0;
            i2 = 20293;
        }
        if (cy0 == null) {
            throw new IllegalArgumentException();
        }
        if (hl0 == null || (arrayList = hl0.a) == null) {
            return cy0;
        }
        cy0.h = true;
        D74[] d74Arr = new D74[0];
        cy0.i = d74Arr;
        cy0.i = (D74[]) arrayList.toArray(d74Arr);
        return cy0;
    }

    public static int a(int i, Parcel parcel) {
        int dataPosition = parcel.dataPosition() + i;
        if (i < 0 || dataPosition < i || dataPosition > parcel.dataSize()) {
            throw new IllegalArgumentException();
        }
        return dataPosition;
    }

    public static ArrayList e(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readInt; i++) {
            WebAuthnCredentialDetails webAuthnCredentialDetails = new WebAuthnCredentialDetails();
            if (parcel.readInt() != 4) {
                throw new IllegalArgumentException();
            }
            parcel.readString();
            Pair g = g(parcel);
            if (((Integer) g.first).intValue() != 20293) {
                throw new IllegalArgumentException();
            }
            int a = a(((Integer) g.second).intValue(), parcel);
            webAuthnCredentialDetails.e = true;
            while (parcel.dataPosition() < a) {
                Pair g2 = g(parcel);
                switch (((Integer) g2.first).intValue()) {
                    case 1:
                        webAuthnCredentialDetails.a = parcel.readString();
                        break;
                    case 2:
                        webAuthnCredentialDetails.b = parcel.readString();
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        webAuthnCredentialDetails.c = parcel.createByteArray();
                        break;
                    case 4:
                        webAuthnCredentialDetails.d = parcel.createByteArray();
                        break;
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                        webAuthnCredentialDetails.e = parcel.readInt() != 0;
                        break;
                    case 6:
                        parcel.readInt();
                        break;
                    default:
                        parcel.setDataPosition(a(((Integer) g2.second).intValue(), parcel));
                        break;
                }
            }
            if (webAuthnCredentialDetails.d == null) {
                throw new IllegalArgumentException();
            }
            if (webAuthnCredentialDetails.e && (webAuthnCredentialDetails.a == null || webAuthnCredentialDetails.b == null || webAuthnCredentialDetails.c == null)) {
                throw new IllegalArgumentException();
            }
            arrayList.add(webAuthnCredentialDetails);
        }
        return arrayList;
    }
}
