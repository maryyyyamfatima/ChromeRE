package defpackage;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.chromium.components.signin.AccountManagerFacade;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class B4 {
    public static final Pattern a = Pattern.compile("@");

    public static Account c(String str) {
        return new Account(str, "com.google");
    }

    public static ArrayList f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Account) it.next()).name);
        }
        return arrayList;
    }

    public static Account d(String str, List list) {
        String a2 = a(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Account account = (Account) it.next();
            if (a(account.name).equals(a2)) {
                return account;
            }
        }
        return null;
    }

    public static List e(MC2 mc2) {
        return mc2.d() ? (List) mc2.b : Collections.emptyList();
    }

    public static void b(AccountManagerFacade accountManagerFacade, List list, Q2 q2) {
        if (list.size() >= 1) {
            accountManagerFacade.d((Account) list.get(0), q2);
        } else {
            q2.a(false, null);
        }
    }

    public static String a(String str) {
        String[] split = a.split(str);
        if (split.length != 2) {
            return str;
        }
        if ("googlemail.com".equalsIgnoreCase(split[1])) {
            split[1] = "gmail.com";
        }
        if ("gmail.com".equalsIgnoreCase(split[1])) {
            split[0] = split[0].replace(".", "");
        }
        return (split[0] + "@" + split[1]).toLowerCase(Locale.US);
    }
}
