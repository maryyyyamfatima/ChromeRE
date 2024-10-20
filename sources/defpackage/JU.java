package defpackage;

import android.accounts.Account;
import android.view.View;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JU {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final View e;
    public final String f;
    public final String g;
    public final C5636ga3 h;
    public final boolean i;
    public Integer j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    public JU(Account account, Set set, C4317ck c4317ck, String str, String str2, C5636ga3 c5636ga3) {
        this.a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        C4317ck emptyMap = c4317ck == null ? Collections.emptyMap() : c4317ck;
        this.d = emptyMap;
        this.e = null;
        this.f = str;
        this.g = str2;
        this.h = c5636ga3 == null ? C5636ga3.b : c5636ga3;
        this.i = false;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            throw null;
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
