package defpackage;

import android.net.Uri;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h22, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5801h22 {
    public static final String[] a = {"", "http://www.", "https://www.", "http://", "https://", "tel:", "mailto:", "ftp://anonymous:anonymous@", "ftp://ftp.", "ftps://", "sftp://", "smb://", "nfs://", "ftp://", "dav://", "news:", "telnet://", "imap:", "rtsp://", "urn:", "pop:", "sip:", "sips:", "tftp:", "btspp://", "btl2cap://", "btgoep://", "tcpobex://", "irdaobex://", "file://", "urn:epc:id:", "urn:epc:tag:", "urn:epc:pat:", "urn:epc:raw:", "urn:epc:", "urn:nfc:"};

    public static NdefMessage e(C5457g22 c5457g22) {
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                C6145i22[] c6145i22Arr = c5457g22.b;
                if (i < c6145i22Arr.length) {
                    arrayList.add(f(c6145i22Arr[i]));
                    i++;
                } else {
                    NdefRecord[] ndefRecordArr = new NdefRecord[arrayList.size()];
                    arrayList.toArray(ndefRecordArr);
                    return new NdefMessage(ndefRecordArr);
                }
            }
        } catch (C0737Fr1 | UnsupportedEncodingException | IllegalArgumentException unused) {
            throw new C0737Fr1();
        }
    }

    public static C5457g22 d(NdefMessage ndefMessage) {
        C6145i22 c6145i22;
        C6145i22 c6145i222;
        NdefRecord[] records = ndefMessage.getRecords();
        C5457g22 c5457g22 = new C5457g22(0);
        ArrayList arrayList = new ArrayList();
        for (NdefRecord ndefRecord : records) {
            short tnf = ndefRecord.getTnf();
            if (tnf != 0) {
                c6145i22 = null;
                C5457g22 c5457g222 = null;
                C5457g22 c5457g223 = null;
                C5457g22 c5457g224 = null;
                c6145i22 = null;
                c6145i22 = null;
                c6145i22 = null;
                if (tnf != 1) {
                    if (tnf == 2) {
                        String str = new String(ndefRecord.getType(), "UTF-8");
                        byte[] payload = ndefRecord.getPayload();
                        c6145i22 = new C6145i22(0);
                        c6145i22.b = 0;
                        c6145i22.c = "mime";
                        c6145i22.d = str;
                        c6145i22.h = payload;
                    } else if (tnf == 3) {
                        c6145i22 = b(true, ndefRecord.toUri());
                    } else if (tnf == 4) {
                        String str2 = new String(ndefRecord.getType(), "UTF-8");
                        byte[] payload2 = ndefRecord.getPayload();
                        c6145i222 = new C6145i22(0);
                        c6145i222.b = 1;
                        c6145i222.c = str2;
                        c6145i222.h = payload2;
                        try {
                            c5457g224 = d(new NdefMessage(payload2));
                        } catch (FormatException | UnsupportedEncodingException unused) {
                        }
                        c6145i222.i = c5457g224;
                        c6145i22 = c6145i222;
                    } else if (tnf == 5) {
                        byte[] payload3 = ndefRecord.getPayload();
                        c6145i22 = new C6145i22(0);
                        c6145i22.b = 0;
                        c6145i22.c = "unknown";
                        c6145i22.h = payload3;
                    }
                } else if (Arrays.equals(ndefRecord.getType(), NdefRecord.RTD_URI)) {
                    c6145i22 = b(false, ndefRecord.toUri());
                } else if (Arrays.equals(ndefRecord.getType(), NdefRecord.RTD_TEXT)) {
                    byte[] payload4 = ndefRecord.getPayload();
                    if (payload4.length != 0) {
                        C6145i22 c6145i223 = new C6145i22(0);
                        c6145i223.b = 0;
                        c6145i223.c = "text";
                        int i = payload4[0];
                        c6145i223.f = (i & 128) == 0 ? "utf-8" : "utf-16";
                        int i2 = i & 63;
                        c6145i223.g = new String(payload4, 1, i2, "US-ASCII");
                        int i3 = i2 + 1;
                        if (i3 <= payload4.length) {
                            c6145i223.h = Arrays.copyOfRange(payload4, i3, payload4.length);
                            c6145i22 = c6145i223;
                        }
                    }
                } else if (Arrays.equals(ndefRecord.getType(), NdefRecord.RTD_SMART_POSTER)) {
                    byte[] payload5 = ndefRecord.getPayload();
                    C6145i22 c6145i224 = new C6145i22(0);
                    c6145i224.b = 0;
                    c6145i224.c = "smart-poster";
                    c6145i224.h = payload5;
                    try {
                        c5457g223 = d(new NdefMessage(payload5));
                    } catch (FormatException | UnsupportedEncodingException unused2) {
                    }
                    c6145i224.i = c5457g223;
                    c6145i22 = c6145i224;
                } else {
                    String concat = ":".concat(new String(ndefRecord.getType(), "UTF-8"));
                    if (c(concat)) {
                        byte[] payload6 = ndefRecord.getPayload();
                        c6145i222 = new C6145i22(0);
                        c6145i222.b = 2;
                        c6145i222.c = concat;
                        c6145i222.h = payload6;
                        try {
                            c5457g222 = d(new NdefMessage(payload6));
                        } catch (FormatException | UnsupportedEncodingException unused3) {
                        }
                        c6145i222.i = c5457g222;
                        c6145i22 = c6145i222;
                    }
                }
            } else {
                c6145i22 = new C6145i22(0);
                c6145i22.b = 0;
                c6145i22.c = "empty";
                c6145i22.h = new byte[0];
            }
            if (c6145i22 != null && ndefRecord.getTnf() != 0) {
                c6145i22.e = new String(ndefRecord.getId(), "UTF-8");
            }
            if (c6145i22 != null) {
                arrayList.add(c6145i22);
            }
        }
        C6145i22[] c6145i22Arr = new C6145i22[arrayList.size()];
        c5457g22.b = c6145i22Arr;
        arrayList.toArray(c6145i22Arr);
        return c5457g22;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b9, code lost:            throw new defpackage.C0737Fr1();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.nfc.NdefRecord f(defpackage.C6145i22 r14) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5801h22.f(i22):android.nfc.NdefRecord");
    }

    public static C6145i22 b(boolean z, Uri uri) {
        if (uri == null) {
            return null;
        }
        C6145i22 c6145i22 = new C6145i22(0);
        c6145i22.b = 0;
        if (z) {
            c6145i22.c = "absolute-url";
        } else {
            c6145i22.c = "url";
        }
        c6145i22.h = AbstractC9771sd.b(uri.toString());
        return c6145i22;
    }

    public static NdefRecord a(String str, boolean z, byte[] bArr) {
        byte b;
        String uri = Uri.parse(new String(bArr, "UTF-8")).normalizeScheme().toString();
        if (uri.length() == 0) {
            throw new IllegalArgumentException("uri is empty");
        }
        byte[] b2 = str == null ? null : AbstractC9771sd.b(str);
        if (z) {
            return new NdefRecord((short) 3, AbstractC9771sd.b(uri), b2, null);
        }
        int i = 1;
        while (true) {
            if (i >= 36) {
                b = 0;
                break;
            }
            String[] strArr = a;
            if (uri.startsWith(strArr[i])) {
                b = (byte) i;
                uri = uri.substring(strArr[i].length());
                break;
            }
            i++;
        }
        byte[] b3 = AbstractC9771sd.b(uri);
        byte[] bArr2 = new byte[b3.length + 1];
        bArr2[0] = b;
        System.arraycopy(b3, 0, bArr2, 1, b3.length);
        return new NdefRecord((short) 1, NdefRecord.RTD_URI, b2, bArr2);
    }

    public static boolean c(String str) {
        if (Charset.forName("US-ASCII").newEncoder().canEncode(str) && str.length() >= 2 && str.length() <= 256 && str.charAt(0) == ':') {
            return Character.isLowerCase(str.charAt(1)) || Character.isDigit(str.charAt(1));
        }
        return false;
    }
}
