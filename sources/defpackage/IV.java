package defpackage;

import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IV extends IOException {
    public IV(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public IV(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super(AbstractC4809e90.a("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
    }
}
