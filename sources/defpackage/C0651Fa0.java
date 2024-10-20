package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0651Fa0 implements FilenameFilter {
    public final /* synthetic */ Pattern a;

    public C0651Fa0(Pattern pattern) {
        this.a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.a.matcher(str).find();
    }
}
