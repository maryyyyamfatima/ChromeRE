package defpackage;

import android.app.Activity;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.TagLostException;
import android.os.Process;
import android.os.Vibrator;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.chromium.device.nfc.NfcDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q42 */
/* loaded from: classes2.dex */
public final class C8905q42 implements InterfaceC4094c42 {
    public final int a;
    public final NfcDelegate g;
    public C9026qR2 h;
    public final NfcManager i;
    public final NfcAdapter j;
    public Activity k;
    public final boolean l;
    public C8562p42 n;
    public C8219o42 o;
    public C7875n42 p;
    public J42 q;
    public InterfaceC5125f42 r;
    public final Vibrator t;
    public final ArrayList s = new ArrayList();
    public boolean m = false;

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
    }

    public C8905q42(int i, NfcDelegate nfcDelegate, C0207Bp1 c0207Bp1) {
        this.a = i;
        this.g = nfcDelegate;
        if (c0207Bp1 != null) {
            InterfaceC11102wV1 n0 = c0207Bp1.n0();
            C9026qR2 c9026qR2 = new C9026qR2(n0);
            InterfaceC7559m90 J0 = n0.J0();
            c9026qR2.a.j = this;
            c9026qR2.g = new C4100c52(J0, this);
            c9026qR2.b();
            this.h = c9026qR2;
        }
        boolean z = V60.a.checkPermission("android.permission.NFC", Process.myPid(), Process.myUid()) == 0;
        this.l = z;
        nfcDelegate.b(new C7531m42(this), i);
        if (!z) {
            AbstractC4851eH1.f("NfcImpl", "NFC operations are not permitted.", new Object[0]);
            this.j = null;
            this.i = null;
        } else {
            NfcManager nfcManager = (NfcManager) V60.a.getSystemService("nfc");
            this.i = nfcManager;
            if (nfcManager == null) {
                AbstractC4851eH1.f("NfcImpl", "NFC is not supported.", new Object[0]);
                this.j = null;
            } else {
                this.j = nfcManager.getDefaultAdapter();
            }
        }
        this.t = (Vibrator) V60.a.getSystemService("vibrator");
    }

    @Override // defpackage.InterfaceC4094c42
    public final void X(InterfaceC5125f42 interfaceC5125f42) {
        this.r = interfaceC5125f42;
    }

    @Override // defpackage.InterfaceC4094c42
    public final void l1(C5457g22 c5457g22, C6487j22 c6487j22, V42 v42) {
        C6145i22[] c6145i22Arr;
        String str;
        if (c(v42)) {
            if (this.m) {
                v42.a(e(4, "Cannot push the message because NFC operations are suspended."));
            }
            boolean z = false;
            if (c5457g22 != null && (c6145i22Arr = c5457g22.b) != null && c6145i22Arr.length != 0) {
                int i = 0;
                while (true) {
                    C6145i22[] c6145i22Arr2 = c5457g22.b;
                    boolean z2 = true;
                    if (i >= c6145i22Arr2.length) {
                        z = true;
                        break;
                    }
                    C6145i22 c6145i22 = c6145i22Arr2[i];
                    if (c6145i22 == null || (!c6145i22.c.equals("empty") && (c6145i22.h == null || (!c6145i22.c.equals("mime") ? c6145i22.d != null : !((str = c6145i22.d) != null && !str.isEmpty()))))) {
                        z2 = false;
                    }
                    if (!z2) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (!z) {
                v42.a(e(3, "Cannot push the message because it's invalid."));
                return;
            }
            C8219o42 c8219o42 = this.o;
            if (c8219o42 != null) {
                C5113f22 e = e(4, "Push is cancelled due to a new push request.");
                V42 v422 = c8219o42.c;
                if (v422 != null) {
                    v422.a(e);
                }
            }
            this.o = new C8219o42(c5457g22, c6487j22, v42);
            i();
            u();
        }
    }

    @Override // defpackage.InterfaceC4094c42
    public final void e0() {
        C5113f22 e = e(4, "The push operation is cancelled.");
        C8219o42 c8219o42 = this.o;
        if (c8219o42 == null) {
            return;
        }
        V42 v42 = c8219o42.c;
        if (v42 != null) {
            v42.a(e);
        }
        this.o = null;
        h();
    }

    @Override // defpackage.InterfaceC4094c42
    public final void o(R42 r42) {
        if (c(r42)) {
            if (this.m) {
                r42.a(e(4, "Cannot make read-only because NFC operations are suspended."));
            }
            C7875n42 c7875n42 = this.p;
            if (c7875n42 != null) {
                C5113f22 e = e(4, "Make read-only is cancelled due to a new make read-only request.");
                R42 r422 = c7875n42.a;
                if (r422 != null) {
                    r422.a(e);
                }
            }
            this.p = new C7875n42(r42);
            i();
            s();
        }
    }

    @Override // defpackage.InterfaceC4094c42
    public final void N() {
        C5113f22 e = e(4, "The make read-only operation is cancelled.");
        C7875n42 c7875n42 = this.p;
        if (c7875n42 == null) {
            return;
        }
        R42 r42 = c7875n42.a;
        if (r42 != null) {
            r42.a(e);
        }
        this.p = null;
        h();
    }

    @Override // defpackage.InterfaceC4094c42
    public final void d1(int i, C3413a52 c3413a52) {
        if (c(c3413a52)) {
            ArrayList arrayList = this.s;
            if (arrayList.contains(Integer.valueOf(i))) {
                c3413a52.a(e(2, "Cannot start because the received scan request is duplicate."));
                return;
            }
            arrayList.add(Integer.valueOf(i));
            c3413a52.a(null);
            i();
            y();
        }
    }

    @Override // defpackage.InterfaceC4094c42
    public final void b0(int i) {
        ArrayList arrayList = this.s;
        if (arrayList.contains(Integer.valueOf(i))) {
            arrayList.remove(arrayList.indexOf(Integer.valueOf(i)));
            h();
        }
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.a(this.a);
        f();
    }

    public static C5113f22 e(int i, String str) {
        C5113f22 c5113f22 = new C5113f22(0);
        c5113f22.b = i;
        c5113f22.c = str;
        return c5113f22;
    }

    public final boolean c(InterfaceC9305rF interfaceC9305rF) {
        C5113f22 e;
        NfcAdapter nfcAdapter;
        if (!this.l || this.k == null) {
            e = e(0, "The operation is not allowed.");
        } else if (this.i == null || (nfcAdapter = this.j) == null) {
            e = e(1, "NFC is not supported.");
        } else {
            e = !nfcAdapter.isEnabled() ? e(2, "NFC setting is disabled.") : null;
        }
        if (e == null) {
            return true;
        }
        interfaceC9305rF.a(e);
        return false;
    }

    public final void i() {
        NfcAdapter nfcAdapter;
        if (this.n != null || this.k == null || (nfcAdapter = this.j) == null) {
            return;
        }
        if (this.o == null && this.p == null && this.s.size() == 0) {
            return;
        }
        C8562p42 c8562p42 = new C8562p42(this);
        this.n = c8562p42;
        nfcAdapter.enableReaderMode(this.k, c8562p42, 271, null);
    }

    public final void f() {
        NfcAdapter nfcAdapter;
        if (this.n == null) {
            return;
        }
        this.n = null;
        Activity activity = this.k;
        if (activity == null || (nfcAdapter = this.j) == null || activity.isDestroyed()) {
            return;
        }
        nfcAdapter.disableReaderMode(this.k);
    }

    public final void h() {
        if (this.o == null && this.p == null && this.s.size() == 0) {
            f();
        }
    }

    public final void r(C5113f22 c5113f22) {
        C8219o42 c8219o42 = this.o;
        if (c8219o42 != null) {
            V42 v42 = c8219o42.c;
            if (v42 != null) {
                v42.a(c5113f22);
            }
            this.o = null;
            h();
        }
        if (c5113f22 != null) {
            this.q = null;
        }
    }

    public final void u() {
        boolean z;
        J42 j42 = this.q;
        if (j42 == null || this.o == null) {
            return;
        }
        try {
            j42.a();
            z = false;
        } catch (IOException unused) {
            z = j42.c;
        }
        if (z) {
            this.q = null;
            return;
        }
        try {
            this.q.a();
            if (!this.o.b.b && !this.q.b.c()) {
                AbstractC4851eH1.f("NfcImpl", "Cannot overwrite the NFC tag due to existing data on it.", new Object[0]);
                r(e(0, "NDEFWriteOptions#overwrite does not allow overwrite."));
            } else {
                this.q.b.a(AbstractC5801h22.e(this.o.a));
                r(null);
            }
        } catch (C0737Fr1 unused2) {
            AbstractC4851eH1.f("NfcImpl", "Cannot write data to NFC tag. Invalid NdefMessage.", new Object[0]);
            r(e(3, "Cannot push the message because it's invalid."));
        } catch (FormatException e) {
            e = e;
            AbstractC4851eH1.f("NfcImpl", "Cannot write data to NFC tag: " + e.getMessage(), new Object[0]);
            r(e(5, "Failed to write due to an IO error: " + e.getMessage()));
        } catch (TagLostException e2) {
            AbstractC4851eH1.f("NfcImpl", "Cannot write data to NFC tag. Tag is lost: " + e2.getMessage(), new Object[0]);
            r(e(5, "Failed to write because the tag is lost: " + e2.getMessage()));
        } catch (IOException e3) {
            e = e3;
            AbstractC4851eH1.f("NfcImpl", "Cannot write data to NFC tag: " + e.getMessage(), new Object[0]);
            r(e(5, "Failed to write due to an IO error: " + e.getMessage()));
        } catch (IllegalStateException e4) {
            e = e4;
            AbstractC4851eH1.f("NfcImpl", "Cannot write data to NFC tag: " + e.getMessage(), new Object[0]);
            r(e(5, "Failed to write due to an IO error: " + e.getMessage()));
        }
    }

    public final void s() {
        boolean z;
        J42 j42 = this.q;
        if (j42 == null || this.p == null) {
            return;
        }
        try {
            j42.a();
            z = false;
        } catch (IOException unused) {
            z = j42.c;
        }
        if (z) {
            this.q = null;
            return;
        }
        try {
            this.q.a();
            if (this.q.b.b()) {
                C7875n42 c7875n42 = this.p;
                if (c7875n42 == null) {
                    return;
                }
                R42 r42 = c7875n42.a;
                if (r42 != null) {
                    r42.a(null);
                }
                this.p = null;
                h();
                return;
            }
            AbstractC4851eH1.f("NfcImpl", "Cannot make NFC tag read-only. The tag cannot be made read-only", new Object[0]);
            C5113f22 e = e(1, "Failed to make read-only because the tag cannot be made read-only");
            C7875n42 c7875n422 = this.p;
            if (c7875n422 != null) {
                R42 r422 = c7875n422.a;
                if (r422 != null) {
                    r422.a(e);
                }
                this.p = null;
                h();
            }
            this.q = null;
        } catch (TagLostException e2) {
            AbstractC4851eH1.f("NfcImpl", "Cannot make NFC tag read-only. Tag is lost: " + e2.getMessage(), new Object[0]);
            C5113f22 e3 = e(5, "Failed to make read-only because the tag is lost: " + e2.getMessage());
            C7875n42 c7875n423 = this.p;
            if (c7875n423 != null) {
                R42 r423 = c7875n423.a;
                if (r423 != null) {
                    r423.a(e3);
                }
                this.p = null;
                h();
            }
            this.q = null;
        } catch (IOException e4) {
            AbstractC4851eH1.f("NfcImpl", "Cannot make NFC tag read-only: " + e4.getMessage(), new Object[0]);
            C5113f22 e5 = e(5, "Failed to make read-only due to an IO error: " + e4.getMessage());
            C7875n42 c7875n424 = this.p;
            if (c7875n424 != null) {
                R42 r424 = c7875n424.a;
                if (r424 != null) {
                    r424.a(e5);
                }
                this.p = null;
                h();
            }
            this.q = null;
        }
    }

    public final void y() {
        boolean z;
        if (this.q == null || this.r == null || this.s.size() == 0 || this.m) {
            return;
        }
        J42 j42 = this.q;
        j42.getClass();
        try {
            j42.a();
            z = false;
        } catch (IOException unused) {
            z = j42.c;
        }
        if (z) {
            this.q = null;
            return;
        }
        try {
            this.q.a();
            NdefMessage read = this.q.b.read();
            if (read == null) {
                C5457g22 c5457g22 = new C5457g22(0);
                c5457g22.b = new C6145i22[0];
                k(c5457g22);
                return;
            }
            k(AbstractC5801h22.d(read));
        } catch (FormatException e) {
            e = e;
            AbstractC4851eH1.f("NfcImpl", "Cannot read data from NFC tag. IO_ERROR: " + e.getMessage(), new Object[0]);
            j(e(5, "Failed to read due to an IO error: " + e.getMessage()));
        } catch (TagLostException e2) {
            AbstractC4851eH1.f("NfcImpl", "Cannot read data from NFC tag. Tag is lost: " + e2.getMessage(), new Object[0]);
            j(e(5, "Failed to read because the tag is lost: " + e2.getMessage()));
        } catch (UnsupportedEncodingException e3) {
            AbstractC4851eH1.f("NfcImpl", "Cannot read data from NFC tag. Cannot convert to NdefMessage:" + e3.getMessage(), new Object[0]);
            j(e(3, "Failed to decode the NdefMessage read from the tag: " + e3.getMessage()));
        } catch (IOException e4) {
            e = e4;
            AbstractC4851eH1.f("NfcImpl", "Cannot read data from NFC tag. IO_ERROR: " + e.getMessage(), new Object[0]);
            j(e(5, "Failed to read due to an IO error: " + e.getMessage()));
        } catch (IllegalStateException e5) {
            e = e5;
            AbstractC4851eH1.f("NfcImpl", "Cannot read data from NFC tag. IO_ERROR: " + e.getMessage(), new Object[0]);
            j(e(5, "Failed to read due to an IO error: " + e.getMessage()));
        }
    }

    public final void j(C5113f22 c5113f22) {
        if (this.s.size() != 0) {
            C6499j42 c6499j42 = (C6499j42) this.r;
            c6499j42.getClass();
            C5813h42 c5813h42 = new C5813h42(0);
            c5813h42.b = c5113f22;
            C6068hp1 c6068hp1 = c6499j42.a;
            c6068hp1.g.A(c5813h42.c(c6068hp1.a, new C5953hV1(1)));
        }
    }

    public final void k(C5457g22 c5457g22) {
        ArrayList arrayList = this.s;
        if (arrayList.size() != 0) {
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Integer) arrayList.get(i)).intValue();
            }
            ((C6499j42) this.r).c(iArr, this.q.d, c5457g22);
        }
    }
}
