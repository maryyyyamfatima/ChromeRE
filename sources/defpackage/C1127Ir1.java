package defpackage;

import com.google.protobuf.MessageLite;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ir1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1127Ir1 extends IOException {
    public static final /* synthetic */ int h = 0;
    public MessageLite a;
    public boolean g;

    public C1127Ir1(String str) {
        super(str);
    }

    public C1127Ir1(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static C1127Ir1 h() {
        return new C1127Ir1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static C1127Ir1 f() {
        return new C1127Ir1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C1127Ir1 e() {
        return new C1127Ir1("CodedInputStream encountered a malformed varint.");
    }

    public static C1127Ir1 b() {
        return new C1127Ir1("Protocol message contained an invalid tag (zero).");
    }

    public static C1127Ir1 a() {
        return new C1127Ir1("Protocol message end-group tag did not match expected tag.");
    }

    public static C0997Hr1 d() {
        return new C0997Hr1();
    }

    public static C1127Ir1 g() {
        return new C1127Ir1("Failed to parse the message.");
    }

    public static C1127Ir1 c() {
        return new C1127Ir1("Protocol message had invalid UTF-8.");
    }
}
