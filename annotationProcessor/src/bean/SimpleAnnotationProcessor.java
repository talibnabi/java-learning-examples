package bean;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("bean.BoshOlmasin")
@SupportedSourceVersion(SourceVersion.RELEASE_18)
public class SimpleAnnotationProcessor extends AbstractProcessor {
    @Override
    public boolean process(final Set<? extends TypeElement> annotations,
                           final RoundEnvironment roundEnv) {
        System.out.println("Processor is executed.");
        for (final Element element : roundEnv.getElementsAnnotatedWith(bean.BoshOlmasin.class)) {
            System.out.println(element.getSimpleName());
            System.out.println("Element: " + element.getClass().getName());
            if (element instanceof TypeElement) {
                final TypeElement typeElement = (TypeElement) element;

                for (final Element eclosedElement : typeElement.getEnclosedElements()) {
                    if (eclosedElement instanceof VariableElement) {
                        final VariableElement variableElement = (VariableElement) eclosedElement;
                        if (variableElement.getConstantValue() == null) {
                            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "bosh olmasin");
                        }
                    }
                }
            }
        }
        return true;
    }
}