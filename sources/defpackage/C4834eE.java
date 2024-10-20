package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4834eE {
    public static final String c = AbstractC10521un3.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    public final String a;
    public final String b;

    static {
        AbstractC10521un3.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        AbstractC10521un3.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new PA0("proto"), new PA0("json"))));
    }

    public C4834eE(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static C4834eE a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C4834eE(str2, str3);
    }
}
