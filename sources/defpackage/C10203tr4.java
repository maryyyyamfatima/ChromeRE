package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.Stack;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tr4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10203tr4 extends DefaultHandler {
    public final C9860sr4 a;
    public final Stack b;

    public C10203tr4(String str) {
        C9860sr4 c9860sr4 = new C9860sr4(null);
        this.a = c9860sr4;
        Stack stack = new Stack();
        this.b = stack;
        stack.push(c9860sr4);
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(new InputSource(new StringReader(str)), this);
            if (stack.peek() != c9860sr4) {
                throw new UN2("XML was malformed.", 1);
            }
        } catch (IOException e) {
            throw new UN2(1, "Hit IOException", e);
        } catch (ParserConfigurationException e2) {
            throw new UN2(1, "Hit ParserConfigurationException", e2);
        } catch (SAXParseException e3) {
            throw new UN2(1, "Hit SAXParseException", e3);
        } catch (SAXException e4) {
            throw new UN2(1, "Hit SAXException", e4);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Stack stack = this.b;
        if (stack.empty()) {
            throw new SAXException("Tag stack is empty when it shouldn't be.");
        }
        C9860sr4 c9860sr4 = new C9860sr4(str3);
        ((C9860sr4) stack.peek()).c.add(c9860sr4);
        stack.push(c9860sr4);
        for (int i = 0; i < attributes.getLength(); i++) {
            String localName = attributes.getLocalName(i);
            c9860sr4.b.put(localName, attributes.getValue(localName));
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        Stack stack = this.b;
        if (stack.empty()) {
            throw new SAXException(AbstractC4809e90.a("Tried closing empty stack with ", str3));
        }
        if (!TextUtils.equals(str3, ((C9860sr4) stack.peek()).a)) {
            throw new SAXException(AbstractC10204ts.a(new StringBuilder("Tried closing "), ((C9860sr4) stack.peek()).a, " with ", str3));
        }
        stack.pop();
    }
}
