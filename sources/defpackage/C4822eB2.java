package defpackage;

import J.N;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eB2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4822eB2 {
    public static long a(long j, String str) {
        C7928nE c7928nE = UN.a;
        String MMltG$kc = N.MMltG$kc("ProbabilisticCryptidRenderer", str);
        try {
            if (MMltG$kc.length() > 0) {
                return Long.parseLong(MMltG$kc);
            }
        } catch (NumberFormatException e) {
            AbstractC4851eH1.a("ProbabilisticCryptid", String.format("Invalid long value %s for param %s", MMltG$kc, str), e);
        }
        return j;
    }
}
