package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iB3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6199iB3 implements Callback {
    public final /* synthetic */ C7573mB3 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [jB3] */
    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        final C7573mB3 c7573mB3 = this.a;
        C5511gB3 c5511gB3 = (C5511gB3) obj;
        synchronized (c7573mB3.j) {
            if (c5511gB3.b.equals(c7573mB3.k)) {
                c7573mB3.n--;
                c7573mB3.j.addAll(c5511gB3.a);
                if (c7573mB3.n == 0) {
                    Iterator it = c7573mB3.m.iterator();
                    while (true) {
                        C11814ya2 c11814ya2 = (C11814ya2) it;
                        if (!c11814ya2.hasNext()) {
                            break;
                        }
                        InterfaceC5855hB3 interfaceC5855hB3 = (InterfaceC5855hB3) c11814ya2.next();
                        LinkedList a = C7573mB3.a(c7573mB3.j);
                        ?? r4 = new Callback() { // from class: jB3
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj2) {
                                return new ZE(this, obj2);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj2) {
                                C7573mB3 c7573mB32 = C7573mB3.this;
                                WA3 wa3 = (WA3) obj2;
                                c7573mB32.getClass();
                                int i = 0;
                                if (wa3 != null) {
                                    String str = "";
                                    int i2 = wa3.a.b;
                                    if (i2 == 0) {
                                        str = "Grouping";
                                    } else if (i2 == 1) {
                                        str = "Closing";
                                    }
                                    int i3 = wa3.b;
                                    if (i3 == 0) {
                                        FI2.a("TabsSuggestions.NotConsidered.".concat(str));
                                        synchronized (c7573mB32.h) {
                                            int i4 = c7573mB32.h.getInt("BackoffIdxKey", 0);
                                            long[] jArr = C7573mB3.q;
                                            int min = Math.min(i4, jArr.length - 1);
                                            SharedPreferences.Editor edit = c7573mB32.h.edit();
                                            edit.putLong("BackoffCountKey", jArr[min]);
                                            edit.putInt("BackoffIdxKey", min + 1);
                                            edit.putLong("LastTimestamp", System.currentTimeMillis());
                                            edit.apply();
                                        }
                                        return;
                                    }
                                    if (i3 == 1) {
                                        FI2.a("TabsSuggestions.Considered.Dismissed.".concat(str));
                                        return;
                                    }
                                    if (i3 == 2) {
                                        FI2.a("TabsSuggestions.Considered.Accepted.".concat(str));
                                    }
                                    HashSet hashSet = new HashSet();
                                    Iterator it2 = wa3.a.a.iterator();
                                    while (it2.hasNext()) {
                                        hashSet.add(Integer.valueOf(((C6106hv3) it2.next()).i));
                                    }
                                    Iterator it3 = wa3.c.iterator();
                                    int i5 = 0;
                                    while (it3.hasNext()) {
                                        if (hashSet.contains(Integer.valueOf(((Integer) it3.next()).intValue()))) {
                                            i++;
                                        } else {
                                            i5++;
                                        }
                                    }
                                    EI2.d((wa3.a.a.size() - i) + i5, "Tabs.Suggestions.NumSuggestionsChanged.".concat(str));
                                    return;
                                }
                                AbstractC4851eH1.a("TabSuggestDetailed", "TabSuggestionFeedback is null", new Object[0]);
                            }
                        };
                        C4136cB3 c4136cB3 = (C4136cB3) interfaceC5855hB3;
                        c4136cB3.getClass();
                        if (a.size() != 0) {
                            Iterator it2 = a.iterator();
                            while (it2.hasNext()) {
                                c4136cB3.c(new C3793bB3(c4136cB3, (VA3) it2.next(), r4));
                            }
                        }
                    }
                }
            }
        }
    }
}
