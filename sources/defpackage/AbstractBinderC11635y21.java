package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC11635y21 extends AbstractBinderC1951Pa1 {
    public final int g;

    public abstract byte[] i1();

    public AbstractBinderC11635y21(byte[] bArr) {
        int length = bArr.length;
        this.g = Arrays.hashCode(bArr);
    }

    public final int hashCode() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        InterfaceC9436re1 L;
        if (obj != null && (obj instanceof InterfaceC2081Qa1)) {
            try {
                InterfaceC2081Qa1 interfaceC2081Qa1 = (InterfaceC2081Qa1) obj;
                if (interfaceC2081Qa1.i() == this.g && (L = interfaceC2081Qa1.L()) != null) {
                    return Arrays.equals(i1(), (byte[]) ObjectWrapper.h1(L));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC2081Qa1
    public final InterfaceC9436re1 L() {
        return new ObjectWrapper(i1());
    }

    @Override // defpackage.InterfaceC2081Qa1
    public final int i() {
        return this.g;
    }

    public static byte[] h1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
