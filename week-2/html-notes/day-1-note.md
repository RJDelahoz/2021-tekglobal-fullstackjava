# HTML/CSS

---

## Document Object Model

-   What is the DOM?
    -   The DOM is a programming interface for HTML and XML documents. It represents the page so the programs can change the document structure, style, and content. The DOM represents the document as nodes and objects. That way, programming languages can connect to the page.

## Box Model

-   The CSS box model is the foundation of a layout on the Web. Each element is represented as a rectangular box, with the box's content, padding, border, and margin built up around one another like layers.
-   **width and height** represent the dimensions of the box. This includes the objects inside the box.
-   **padding** is the space b/t the inner edges of the box and the outer-edges, of the content. Padding can be applied to left, right, top, bottom individualy or all at once.
-   **border** it sits right on top of the outer edges of the padding. The border defines the thickness of the edges of the box.
-   **Margin** it sits right on top of the border. It defines the space b/t one box from another. It defines the space b/t one box to another. Think about the margin as you would personal space.

## Inline Styling

-   Directly affect the tag they are written in, without the use of selectors. In order to use it, we must use the ottribute "style", followed by = "".

## CSS

-   CSS is a style sheet lang. This means that it lets you apply styles selectively to elements in HTML documents.
-   Web Browser apply CSS rules to a document to affect how they are displayed. this is done by applying the following
    -   Selectors: element you want to play the updated property to.
    -   Properties: Have values set to update how the HTML content is displayed.
-   When a browser displays a document, it must combine the documents content with its style information. It processes the two to create the DOM tree.
-   Finally the DOM is displayed in the browser.

## Selectors

-   In CSS, selectors are used to target an individual or group of elements in a webpage that want to style.
    -   **Simple-Selectors**: Selects one or more elements base on the elements name, class, or id.
    -   **Attribute-selectors**: Selects one or more elements based on thier attribute values.
    -   **Psuedo-classes**: Math one or more elements that exist in a certain state, such as an element that is being hovered over by the mouse pad.
    -   **Psuedo-elements**: Match one or more parts of content that are in certian position in relation to an element.
    -   **Combinators**: These are not seperate selectors; the idea is that you can put multiple selectors on the same CSS rule seperated by commas.

## Combinators

-   descendant selector (space)
-   child selector (>)
-   adjacent sibling selector (+)
-   general sibling selector (~)

---

## Display Property

-   The display property defines how an element will be displayed on the dom. The display property consist of two basic ways of displaying an element.
    -   **Outer display type**: tells the element if it needs to be display with elements to either side of it or if it should not allow other boxes to be right new to it.
    -   **Inner display type**: Tells the chikldren of the box how they need to be displayed.

## Inline-block

-   Allows other boxes to sit right next to them. If the box with this display property does not fit in the space available, it will break to a new line.

## Block

-   Does not allow other boxes to sit right next to it and it will use the whole space horizontally.

## Inline

-   Allows other boxes to sit right next to them, if the box with this display does not fit in the space it will try to fit some of its content and whater does not fit does to a new line. Shrink browser to see if it breaks.

_Span is by default shown as inline._

## Class/ID

-   CSS class & id are the most common form of selectors you can use to style HTML pages. The best part is that you can customize the name of the selector as long as you follor syntax rules.
-   Class is meant to target an individual or a group of elements.
-   ID is only meant to target one group.

## Precedence

-   Inline style
-   ID
-   Child to parent
-   class and psuedo classes
-   Elements & psuedo elements

## Position

-   **Static**: is the default value any box displayed in the browser gets.
-   **Relative**: is displayed the same as being a static box, its position is relative to the parent container. However, with relative or any value other than static you have access to additional properties such as: top, left, right, and bottom which allows you to modify the actual position of the box.
-   **Fixed**: A fixed element is positioned relative to the viewport, which means it always stays in the same place even if the page is scrolled.
-   **Absolute**: An element is positioned relative to the nearest positioned ancestor.

## Refrencing files

-   **Rel**: Specifies the relationship between the current document and the linked document.
-   **Type**: Specifies the media type of the linked document.
-   **href**: Specifies the location of the linked document.

## Color

-   rgb
    -   red
    -   green
    -   blue
-   rgba
    -   red
    -   green
    -   blue
    -   opacity
-   Hex

## Float

-   The float css property specifies that an element should be placed along the left or right side of its container allowing text and inline elements to wrap around it. The element is removed from the normal flow of the web page.

## Transitons

-   Provide a way to control animation speed when changing CSS properties. Instead of haviong property changes take effect immediatly, you can cause the changes in a property to take place over a period of time.
-   transition: properties duration timing-function delay;

## Animations

- CSS animations make it possible to animate transitions from one CSS style config to another.
- animations consist of 2 components 
    - A style describing the animation
    - a set of keyframes that indicate the start and end state

## Browser Support

- for some css properties or keywords, it's reccomended to use certain extensions to ensure multiple browser support
    - -webkit-
    - -moz-
    - -o-
    - -ms-

## Transform 

- lets you rotate, scale, skew, or translate an element

## Viewport

- a short tag that is included in the head of your html document that tells the browser how the page should be rendered
- meta name="viewport" content="width=device, initial-scale=1"
