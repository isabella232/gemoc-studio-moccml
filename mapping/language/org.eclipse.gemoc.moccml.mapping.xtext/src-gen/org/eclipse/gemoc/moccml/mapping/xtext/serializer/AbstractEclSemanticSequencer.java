/*
 * generated by Xtext
 */
package org.eclipse.gemoc.moccml.mapping.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLExpression;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingBlockDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDocument;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingPriority;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingTimeBase;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLRelation;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage;
import org.eclipse.gemoc.moccml.mapping.xtext.services.EclGrammarAccess;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.basecs.ConstraintCS;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.ocl.xtext.basecs.MultiplicityBoundsCS;
import org.eclipse.ocl.xtext.basecs.MultiplicityStringCS;
import org.eclipse.ocl.xtext.basecs.ParameterCS;
import org.eclipse.ocl.xtext.basecs.PathElementCS;
import org.eclipse.ocl.xtext.basecs.PathElementWithURICS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.ocl.xtext.basecs.PrimitiveTypeRefCS;
import org.eclipse.ocl.xtext.basecs.TemplateBindingCS;
import org.eclipse.ocl.xtext.basecs.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.xtext.basecs.TemplateSignatureCS;
import org.eclipse.ocl.xtext.basecs.TuplePartCS;
import org.eclipse.ocl.xtext.basecs.TupleTypeCS;
import org.eclipse.ocl.xtext.basecs.TypeParameterCS;
import org.eclipse.ocl.xtext.basecs.TypedTypeRefCS;
import org.eclipse.ocl.xtext.basecs.WildcardTypeRefCS;
import org.eclipse.ocl.xtext.completeocl.serializer.CompleteOCLSemanticSequencer;
import org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLCSPackage;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;
import org.eclipse.ocl.xtext.completeoclcs.DefOperationCS;
import org.eclipse.ocl.xtext.completeoclcs.DefPropertyCS;
import org.eclipse.ocl.xtext.completeoclcs.OCLMessageArgCS;
import org.eclipse.ocl.xtext.completeoclcs.OperationContextDeclCS;
import org.eclipse.ocl.xtext.completeoclcs.PackageDeclarationCS;
import org.eclipse.ocl.xtext.completeoclcs.PropertyContextDeclCS;
import org.eclipse.ocl.xtext.essentialoclcs.BooleanLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.CollectionLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.CollectionLiteralPartCS;
import org.eclipse.ocl.xtext.essentialoclcs.CollectionPatternCS;
import org.eclipse.ocl.xtext.essentialoclcs.CollectionTypeCS;
import org.eclipse.ocl.xtext.essentialoclcs.ContextCS;
import org.eclipse.ocl.xtext.essentialoclcs.CurlyBracketedClauseCS;
import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;
import org.eclipse.ocl.xtext.essentialoclcs.ExpSpecificationCS;
import org.eclipse.ocl.xtext.essentialoclcs.IfExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.IfThenExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.InfixExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.InvalidLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LambdaLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LetExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LetVariableCS;
import org.eclipse.ocl.xtext.essentialoclcs.MapLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.MapLiteralPartCS;
import org.eclipse.ocl.xtext.essentialoclcs.MapTypeCS;
import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NavigatingArgCS;
import org.eclipse.ocl.xtext.essentialoclcs.NestedExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NullLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NumberLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.PatternExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.PrefixExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.RoundBracketedClauseCS;
import org.eclipse.ocl.xtext.essentialoclcs.SelfExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.ShadowPartCS;
import org.eclipse.ocl.xtext.essentialoclcs.SquareBracketedClauseCS;
import org.eclipse.ocl.xtext.essentialoclcs.StringLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.TupleLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.TupleLiteralPartCS;
import org.eclipse.ocl.xtext.essentialoclcs.TypeLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.TypeNameExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.UnlimitedNaturalLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.VariableCS;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractEclSemanticSequencer extends CompleteOCLSemanticSequencer {

	@Inject
	private EclGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BaseCSPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BaseCSPackage.CONSTRAINT_CS:
				sequence_ConstraintCS(context, (ConstraintCS) semanticObject); 
				return; 
			case BaseCSPackage.IMPORT_CS:
				sequence_ImportCS(context, (ImportCS) semanticObject); 
				return; 
			case BaseCSPackage.MULTIPLICITY_BOUNDS_CS:
				if (rule == grammarAccess.getMultiplicityBoundsCSRule()) {
					sequence_MultiplicityBoundsCS(context, (MultiplicityBoundsCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMultiplicityCSRule()) {
					sequence_MultiplicityBoundsCS_MultiplicityCS(context, (MultiplicityBoundsCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.MULTIPLICITY_STRING_CS:
				if (rule == grammarAccess.getMultiplicityCSRule()) {
					sequence_MultiplicityCS_MultiplicityStringCS(context, (MultiplicityStringCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMultiplicityStringCSRule()) {
					sequence_MultiplicityStringCS(context, (MultiplicityStringCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.PARAMETER_CS:
				if (rule == grammarAccess.getDefParameterCSRule()) {
					sequence_DefParameterCS(context, (ParameterCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getParameterCSRule()) {
					sequence_ParameterCS(context, (ParameterCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.PATH_ELEMENT_CS:
				if (rule == grammarAccess.getFirstPathElementCSRule()) {
					sequence_FirstPathElementCS(context, (PathElementCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNextPathElementCSRule()) {
					sequence_NextPathElementCS(context, (PathElementCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getURIFirstPathElementCSRule()) {
					sequence_URIFirstPathElementCS(context, (PathElementCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.PATH_ELEMENT_WITH_URICS:
				sequence_URIFirstPathElementCS(context, (PathElementWithURICS) semanticObject); 
				return; 
			case BaseCSPackage.PATH_NAME_CS:
				if (rule == grammarAccess.getPathNameCSRule()) {
					sequence_PathNameCS(context, (PathNameCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimplePathNameCSRule()) {
					sequence_SimplePathNameCS(context, (PathNameCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getURIPathNameCSRule()) {
					sequence_URIPathNameCS(context, (PathNameCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getUnreservedPathNameCSRule()) {
					sequence_UnreservedPathNameCS(context, (PathNameCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.PRIMITIVE_TYPE_REF_CS:
				if (rule == grammarAccess.getTypedRefCSRule()
						|| rule == grammarAccess.getPrimitiveTypeCSRule()
						|| rule == grammarAccess.getTypeLiteralCSRule()
						|| rule == grammarAccess.getTypeExpWithoutMultiplicityCSRule()
						|| rule == grammarAccess.getTypeRefCSRule()) {
					sequence_PrimitiveTypeCS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_PrimitiveTypeCS_TypeExpCS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_PrimitiveTypeCS_TypeLiteralWithMultiplicityCS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.TEMPLATE_BINDING_CS:
				sequence_TemplateBindingCS(context, (TemplateBindingCS) semanticObject); 
				return; 
			case BaseCSPackage.TEMPLATE_PARAMETER_SUBSTITUTION_CS:
				sequence_TemplateParameterSubstitutionCS(context, (TemplateParameterSubstitutionCS) semanticObject); 
				return; 
			case BaseCSPackage.TEMPLATE_SIGNATURE_CS:
				sequence_TemplateSignatureCS(context, (TemplateSignatureCS) semanticObject); 
				return; 
			case BaseCSPackage.TUPLE_PART_CS:
				sequence_TuplePartCS(context, (TuplePartCS) semanticObject); 
				return; 
			case BaseCSPackage.TUPLE_TYPE_CS:
				if (rule == grammarAccess.getTypedRefCSRule()
						|| rule == grammarAccess.getTupleTypeCSRule()
						|| rule == grammarAccess.getTypeLiteralCSRule()
						|| rule == grammarAccess.getTypeExpWithoutMultiplicityCSRule()
						|| rule == grammarAccess.getTypeRefCSRule()) {
					sequence_TupleTypeCS(context, (TupleTypeCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_TupleTypeCS_TypeExpCS(context, (TupleTypeCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_TupleTypeCS_TypeLiteralWithMultiplicityCS(context, (TupleTypeCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.TYPE_PARAMETER_CS:
				sequence_TypeParameterCS(context, (TypeParameterCS) semanticObject); 
				return; 
			case BaseCSPackage.TYPED_TYPE_REF_CS:
				sequence_TypedTypeRefCS(context, (TypedTypeRefCS) semanticObject); 
				return; 
			case BaseCSPackage.WILDCARD_TYPE_REF_CS:
				sequence_WildcardTypeRefCS(context, (WildcardTypeRefCS) semanticObject); 
				return; 
			}
		else if (epackage == CompleteOCLCSPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CompleteOCLCSPackage.CLASSIFIER_CONTEXT_DECL_CS:
				sequence_ClassifierContextDeclCS(context, (ClassifierContextDeclCS) semanticObject); 
				return; 
			case CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS:
				sequence_CompleteOCLDocumentCS(context, (CompleteOCLDocumentCS) semanticObject); 
				return; 
			case CompleteOCLCSPackage.DEF_OPERATION_CS:
				sequence_DefOperationCS(context, (DefOperationCS) semanticObject); 
				return; 
			case CompleteOCLCSPackage.DEF_PROPERTY_CS:
				sequence_DefPropertyCS(context, (DefPropertyCS) semanticObject); 
				return; 
			case CompleteOCLCSPackage.OCL_MESSAGE_ARG_CS:
				sequence_NavigatingArgExpCS(context, (OCLMessageArgCS) semanticObject); 
				return; 
			case CompleteOCLCSPackage.OPERATION_CONTEXT_DECL_CS:
				sequence_OperationContextDeclCS(context, (OperationContextDeclCS) semanticObject); 
				return; 
			case CompleteOCLCSPackage.PACKAGE_DECLARATION_CS:
				sequence_PackageDeclarationCS(context, (PackageDeclarationCS) semanticObject); 
				return; 
			case CompleteOCLCSPackage.PROPERTY_CONTEXT_DECL_CS:
				sequence_PropertyContextDeclCS(context, (PropertyContextDeclCS) semanticObject); 
				return; 
			}
		else if (epackage == EssentialOCLCSPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EssentialOCLCSPackage.BOOLEAN_LITERAL_EXP_CS:
				sequence_BooleanLiteralExpCS(context, (BooleanLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.COLLECTION_LITERAL_EXP_CS:
				sequence_CollectionLiteralExpCS(context, (CollectionLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.COLLECTION_LITERAL_PART_CS:
				sequence_CollectionLiteralPartCS(context, (CollectionLiteralPartCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.COLLECTION_PATTERN_CS:
				if (rule == grammarAccess.getCollectionPatternCSRule()
						|| rule == grammarAccess.getTypeExpWithoutMultiplicityCSRule()) {
					sequence_CollectionPatternCS(context, (CollectionPatternCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_CollectionPatternCS_TypeExpCS(context, (CollectionPatternCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.COLLECTION_TYPE_CS:
				if (rule == grammarAccess.getTypedRefCSRule()
						|| rule == grammarAccess.getCollectionTypeCSRule()
						|| rule == grammarAccess.getTypeLiteralCSRule()
						|| rule == grammarAccess.getTypeExpWithoutMultiplicityCSRule()
						|| rule == grammarAccess.getTypeRefCSRule()) {
					sequence_CollectionTypeCS(context, (CollectionTypeCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_CollectionTypeCS_TypeExpCS(context, (CollectionTypeCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_CollectionTypeCS_TypeLiteralWithMultiplicityCS(context, (CollectionTypeCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.CONTEXT_CS:
				sequence_Model(context, (ContextCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.CURLY_BRACKETED_CLAUSE_CS:
				sequence_CurlyBracketedClauseCS(context, (CurlyBracketedClauseCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.EXP_SPECIFICATION_CS:
				sequence_SpecificationCS(context, (ExpSpecificationCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.IF_EXP_CS:
				sequence_IfExpCS(context, (IfExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.IF_THEN_EXP_CS:
				sequence_ElseIfThenExpCS(context, (IfThenExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.INFIX_EXP_CS:
				sequence_ExpCS(context, (InfixExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.INVALID_LITERAL_EXP_CS:
				sequence_InvalidLiteralExpCS(context, (InvalidLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.LAMBDA_LITERAL_EXP_CS:
				sequence_LambdaLiteralExpCS(context, (LambdaLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.LET_EXP_CS:
				sequence_LetExpCS(context, (LetExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.LET_VARIABLE_CS:
				sequence_LetVariableCS(context, (LetVariableCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.MAP_LITERAL_EXP_CS:
				sequence_MapLiteralExpCS(context, (MapLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.MAP_LITERAL_PART_CS:
				sequence_MapLiteralPartCS(context, (MapLiteralPartCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.MAP_TYPE_CS:
				if (rule == grammarAccess.getTypedRefCSRule()
						|| rule == grammarAccess.getMapTypeCSRule()
						|| rule == grammarAccess.getTypeLiteralCSRule()
						|| rule == grammarAccess.getTypeExpWithoutMultiplicityCSRule()
						|| rule == grammarAccess.getTypeRefCSRule()) {
					sequence_MapTypeCS(context, (MapTypeCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_MapTypeCS_TypeExpCS(context, (MapTypeCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_MapTypeCS_TypeLiteralWithMultiplicityCS(context, (MapTypeCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.NAME_EXP_CS:
				sequence_NameExpCS(context, (NameExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.NAVIGATING_ARG_CS:
				if (rule == grammarAccess.getNavigatingArgCSRule()) {
					sequence_NavigatingArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNavigatingBarArgCSRule()) {
					sequence_NavigatingBarArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNavigatingCommaArgCSRule()) {
					sequence_NavigatingCommaArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNavigatingSemiArgCSRule()) {
					sequence_NavigatingSemiArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.NESTED_EXP_CS:
				sequence_NestedExpCS(context, (NestedExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.NULL_LITERAL_EXP_CS:
				sequence_NullLiteralExpCS(context, (NullLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.NUMBER_LITERAL_EXP_CS:
				sequence_NumberLiteralExpCS(context, (NumberLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.PATTERN_EXP_CS:
				sequence_PatternExpCS(context, (PatternExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.PREFIX_EXP_CS:
				if (rule == grammarAccess.getPrefixedLetExpCSRule()) {
					sequence_PrefixedLetExpCS(context, (PrefixExpCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpCSRule()
						|| rule == grammarAccess.getNavigatingArgExpCSRule()) {
					sequence_PrefixedLetExpCS_PrefixedPrimaryExpCS(context, (PrefixExpCS) semanticObject); 
					return; 
				}
				else if (action == grammarAccess.getExpCSAccess().getInfixExpCSOwnedLeftAction_3_0_1_0()
						|| rule == grammarAccess.getPrefixedPrimaryExpCSRule()) {
					sequence_PrefixedPrimaryExpCS(context, (PrefixExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.ROUND_BRACKETED_CLAUSE_CS:
				sequence_RoundBracketedClauseCS(context, (RoundBracketedClauseCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.SELF_EXP_CS:
				sequence_SelfExpCS(context, (SelfExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.SHADOW_PART_CS:
				sequence_ShadowPartCS(context, (ShadowPartCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.SQUARE_BRACKETED_CLAUSE_CS:
				sequence_SquareBracketedClauseCS(context, (SquareBracketedClauseCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.STRING_LITERAL_EXP_CS:
				sequence_StringLiteralExpCS(context, (StringLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.TUPLE_LITERAL_EXP_CS:
				sequence_TupleLiteralExpCS(context, (TupleLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.TUPLE_LITERAL_PART_CS:
				sequence_TupleLiteralPartCS(context, (TupleLiteralPartCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.TYPE_LITERAL_EXP_CS:
				sequence_TypeLiteralExpCS(context, (TypeLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.TYPE_NAME_EXP_CS:
				if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_TypeExpCS_TypeNameExpCS(context, (TypeNameExpCS) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeNameExpCSRule()
						|| rule == grammarAccess.getTypeExpWithoutMultiplicityCSRule()) {
					sequence_TypeNameExpCS(context, (TypeNameExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.UNLIMITED_NATURAL_LITERAL_EXP_CS:
				sequence_UnlimitedNaturalLiteralExpCS(context, (UnlimitedNaturalLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.VARIABLE_CS:
				sequence_CoIteratorVariableCS(context, (VariableCS) semanticObject); 
				return; 
			}
		else if (epackage == MoCCMLmappingPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MoCCMLmappingPackage.BLOCK_TYPE:
				if (rule == grammarAccess.getBlockTypeRule()) {
					sequence_BlockType(context, (BlockType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_BlockType_TypeExpCS(context, (BlockType) semanticObject); 
					return; 
				}
				else break;
			case MoCCMLmappingPackage.CASE:
				sequence_CasesRule(context, (Case) semanticObject); 
				return; 
			case MoCCMLmappingPackage.DSA_FEEDBACK:
				sequence_DSAFeedBackRule(context, (DSAFeedback) semanticObject); 
				return; 
			case MoCCMLmappingPackage.EVENT_TYPE:
				if (rule == grammarAccess.getEventTypeRule()) {
					sequence_EventType(context, (EventType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_EventType_TypeExpCS(context, (EventType) semanticObject); 
					return; 
				}
				else break;
			case MoCCMLmappingPackage.IMPORT_STATEMENT:
				sequence_Import(context, (ImportStatement) semanticObject); 
				return; 
			case MoCCMLmappingPackage.MO_CCML_EXPRESSION:
				sequence_MoCCMLExpression(context, (MoCCMLExpression) semanticObject); 
				return; 
			case MoCCMLmappingPackage.MO_CCML_MAPPING_BLOCK_DEF_CS:
				sequence_MoCCMLMappingBlockDefCS(context, (MoCCMLMappingBlockDefCS) semanticObject); 
				return; 
			case MoCCMLmappingPackage.MO_CCML_MAPPING_DOCUMENT:
				sequence_MoCCMLMappingDocument(context, (MoCCMLMappingDocument) semanticObject); 
				return; 
			case MoCCMLmappingPackage.MO_CCML_MAPPING_EVENT_DEF_CS:
				sequence_MoCCMLMappingEventDefCS(context, (MoCCMLMappingEventDefCS) semanticObject); 
				return; 
			case MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY:
				sequence_MoCCMLMappingPriority(context, (MoCCMLMappingPriority) semanticObject); 
				return; 
			case MoCCMLmappingPackage.MO_CCML_MAPPING_TIME_BASE:
				if (rule == grammarAccess.getTimebaseRule()) {
					sequence_Timebase(context, (MoCCMLMappingTimeBase) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeExpCSRule()) {
					sequence_Timebase_TypeExpCS(context, (MoCCMLMappingTimeBase) semanticObject); 
					return; 
				}
				else break;
			case MoCCMLmappingPackage.MO_CCML_RELATION:
				sequence_MoCCMLRelation(context, (MoCCMLRelation) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BlockType returns BlockType
	 *
	 * Constraint:
	 *     {BlockType}
	 */
	protected void sequence_BlockType(ISerializationContext context, BlockType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpCS returns BlockType
	 *
	 * Constraint:
	 *     ownedMultiplicity=MultiplicityCS?
	 */
	protected void sequence_BlockType_TypeExpCS(ISerializationContext context, BlockType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CasesRule returns Case
	 *
	 * Constraint:
	 *     (condition=ExpCS kindOfFeedback=FeedBackKind eventToForce=ExpCS on=ExpCS?)
	 */
	protected void sequence_CasesRule(ISerializationContext context, Case semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpCS returns CollectionPatternCS
	 *
	 * Constraint:
	 *     (ownedType=CollectionTypeCS (ownedParts+=PatternExpCS ownedParts+=PatternExpCS* restVariableName=Identifier)? ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_CollectionPatternCS_TypeExpCS(ISerializationContext context, CollectionPatternCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpCS returns CollectionTypeCS
	 *
	 * Constraint:
	 *     (
	 *         name=CollectionTypeIdentifier 
	 *         (ownedType=TypeExpWithoutMultiplicityCS ownedCollectionMultiplicity=MultiplicityCS?)? 
	 *         ownedMultiplicity=MultiplicityCS?
	 *     )
	 */
	protected void sequence_CollectionTypeCS_TypeExpCS(ISerializationContext context, CollectionTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSAFeedBackRule returns DSAFeedback
	 *
	 * Constraint:
	 *     cases+=CasesRule+
	 */
	protected void sequence_DSAFeedBackRule(ISerializationContext context, DSAFeedback semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EventType returns EventType
	 *
	 * Constraint:
	 *     referedElement=EventKind?
	 */
	protected void sequence_EventType(ISerializationContext context, EventType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpCS returns EventType
	 *
	 * Constraint:
	 *     (referedElement=EventKind? ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_EventType_TypeExpCS(ISerializationContext context, EventType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpCS returns InfixExpCS
	 *     NavigatingArgExpCS returns InfixExpCS
	 *
	 * Constraint:
	 *     (ownedLeft=ExpCS_InfixExpCS_3_0_1_0 name=BinaryOperatorName ownedRight=ExpCS)
	 */
	protected void sequence_ExpCS(ISerializationContext context, InfixExpCS semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EssentialOCLCSPackage.Literals.INFIX_EXP_CS__OWNED_LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EssentialOCLCSPackage.Literals.INFIX_EXP_CS__OWNED_LEFT));
			if (transientValues.isValueTransient(semanticObject, BaseCSPackage.Literals.NAMED_ELEMENT_CS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BaseCSPackage.Literals.NAMED_ELEMENT_CS__NAME));
			if (transientValues.isValueTransient(semanticObject, EssentialOCLCSPackage.Literals.OPERATOR_EXP_CS__OWNED_RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EssentialOCLCSPackage.Literals.OPERATOR_EXP_CS__OWNED_RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpCSAccess().getInfixExpCSOwnedLeftAction_3_0_1_0(), semanticObject.getOwnedLeft());
		feeder.accept(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_3_0_1_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_3_0_1_2_0(), semanticObject.getOwnedRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Import returns ImportStatement
	 *
	 * Constraint:
	 *     importURI=DOUBLE_QUOTED_STRING
	 */
	protected void sequence_Import(ISerializationContext context, ImportStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoCCMLmappingPackage.Literals.IMPORT_STATEMENT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoCCMLmappingPackage.Literals.IMPORT_STATEMENT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportURIDOUBLE_QUOTED_STRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpCS returns MapTypeCS
	 *
	 * Constraint:
	 *     (name='Map' (ownedKeyType=TypeExpCS ownedValueType=TypeExpCS)? ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_MapTypeCS_TypeExpCS(ISerializationContext context, MapTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpCS returns MoCCMLExpression
	 *     MoCCMLExpression returns MoCCMLExpression
	 *     NavigatingArgExpCS returns MoCCMLExpression
	 *
	 * Constraint:
	 *     (type=[ExpressionDeclaration|ID] parameters+=ExpCS parameters+=ExpCS*)
	 */
	protected void sequence_MoCCMLExpression(ISerializationContext context, MoCCMLExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DefCS returns MoCCMLMappingBlockDefCS
	 *     MoCCMLMappingBlockDefCS returns MoCCMLMappingBlockDefCS
	 *
	 * Constraint:
	 *     (
	 *         visibility=Visibility? 
	 *         condition=ExpCS? 
	 *         name=UnrestrictedName 
	 *         ownedType=TypeExpCS 
	 *         ownedSpecification=SpecificationCS 
	 *         enterWhen=ExpCS? 
	 *         leaveWhen=ExpCS?
	 *     )
	 */
	protected void sequence_MoCCMLMappingBlockDefCS(ISerializationContext context, MoCCMLMappingBlockDefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MoCCMLMappingDocument returns MoCCMLMappingDocument
	 *
	 * Constraint:
	 *     (ownedImports+=ImportCS* imports+=Import* (ownedPackages+=PackageDeclarationCS | ownedContexts+=ContextDeclCS)*)
	 */
	protected void sequence_MoCCMLMappingDocument(ISerializationContext context, MoCCMLMappingDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DefCS returns MoCCMLMappingEventDefCS
	 *     MoCCMLMappingEventDefCS returns MoCCMLMappingEventDefCS
	 *
	 * Constraint:
	 *     (
	 *         visibility=Visibility? 
	 *         condition=ExpCS? 
	 *         name=UnrestrictedName 
	 *         ownedType=TypeExpCS 
	 *         ownedSpecification=SpecificationCS 
	 *         dsaResultName=UnrestrictedName? 
	 *         future=ExpCS? 
	 *         feedback=DSAFeedBackRule?
	 *     )
	 */
	protected void sequence_MoCCMLMappingEventDefCS(ISerializationContext context, MoCCMLMappingEventDefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpCS returns MoCCMLMappingPriority
	 *     MoCCMLMappingPriority returns MoCCMLMappingPriority
	 *     NavigatingArgExpCS returns MoCCMLMappingPriority
	 *
	 * Constraint:
	 *     (higher=ExpCS lower=ExpCS)
	 */
	protected void sequence_MoCCMLMappingPriority(ISerializationContext context, MoCCMLMappingPriority semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoCCMLmappingPackage.Literals.MO_CCML_MAPPING_PRIORITY__HIGHER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoCCMLmappingPackage.Literals.MO_CCML_MAPPING_PRIORITY__HIGHER));
			if (transientValues.isValueTransient(semanticObject, MoCCMLmappingPackage.Literals.MO_CCML_MAPPING_PRIORITY__LOWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoCCMLmappingPackage.Literals.MO_CCML_MAPPING_PRIORITY__LOWER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoCCMLMappingPriorityAccess().getHigherExpCSParserRuleCall_3_0(), semanticObject.getHigher());
		feeder.accept(grammarAccess.getMoCCMLMappingPriorityAccess().getLowerExpCSParserRuleCall_6_0(), semanticObject.getLower());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpCS returns MoCCMLRelation
	 *     MoCCMLRelation returns MoCCMLRelation
	 *     NavigatingArgExpCS returns MoCCMLRelation
	 *
	 * Constraint:
	 *     (isAnAssertion?='assert'? type=[RelationDeclaration|ID] parameters+=ExpCS parameters+=ExpCS*)
	 */
	protected void sequence_MoCCMLRelation(ISerializationContext context, MoCCMLRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpCS returns PrimitiveTypeRefCS
	 *
	 * Constraint:
	 *     (name=PrimitiveTypeIdentifier ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_PrimitiveTypeCS_TypeExpCS(ISerializationContext context, PrimitiveTypeRefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Timebase returns MoCCMLMappingTimeBase
	 *
	 * Constraint:
	 *     timeBase=[DenseClockType|ID]?
	 */
	protected void sequence_Timebase(ISerializationContext context, MoCCMLMappingTimeBase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpCS returns MoCCMLMappingTimeBase
	 *
	 * Constraint:
	 *     (timeBase=[DenseClockType|ID]? ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_Timebase_TypeExpCS(ISerializationContext context, MoCCMLMappingTimeBase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpCS returns TupleTypeCS
	 *
	 * Constraint:
	 *     (name='Tuple' (ownedParts+=TuplePartCS ownedParts+=TuplePartCS*)? ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_TupleTypeCS_TypeExpCS(ISerializationContext context, TupleTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpCS returns TypeNameExpCS
	 *
	 * Constraint:
	 *     (ownedPathName=PathNameCS (ownedCurlyBracketedClause=CurlyBracketedClauseCS ownedPatternGuard=ExpCS?)? ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_TypeExpCS_TypeNameExpCS(ISerializationContext context, TypeNameExpCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
